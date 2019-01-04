/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validator;

import Annotation.Constraint;
import Constraint.ConstraintInterface;
import ValidationContext.MetaData;
import ValidationContext.ValidationContext;
import ValidationResult.ValidationResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author tamnnq
 */
public class Validator {

    private static final Lock LOCK = new ReentrantLock();
    private static Validator instance;

    public static Validator getInstance() {
        String key = "";
        if (instance == null) {
            LOCK.lock();
            try {
                if (instance == null) {
                    instance = new Validator();
                }
            } finally {
                LOCK.unlock();
            }
        }
        return instance;
    }

    public ValidationResult validate(Object obj) {
        try {
            ValidationResult result = new ValidationResult();
            Boolean hasMessage;

            ArrayList<MetaData> metaList = buildListMetaData(obj);
            if (metaList != null) {

                for (MetaData data : metaList) {
                    ArrayList<String> errorMessage = new ArrayList<String>();

                    // Validation context of each field
                    ArrayList<ValidationContext> contextList = data.getConstraints();
                    for (ValidationContext context : contextList) {

                        hasMessage = false;

                        // Init validator
                        ConstraintInterface constraint = (ConstraintInterface) context.getConstraint().newInstance();
                        Annotation annotation = context.getAnnotation();
                        constraint.initialize(annotation);

                        Boolean isValid = constraint.isValid(data.getValue());
                        if (!isValid) {
                            Method[] methods = annotation.annotationType().getMethods();
                            for (Method method : methods) {
                                if (method.getName().equals("message")) {
                                    hasMessage = true;

                                    String mess = (String) method.invoke(annotation);
                                    errorMessage.add(mess);
                                }
                            }

                            // Show this message if there is no message
                            if (!hasMessage) {
                                errorMessage.add("This rules has not message!");
                            }
                        }

                    }
                    if (!errorMessage.isEmpty()) {
                        result.add(data.getFieldName(), errorMessage);
                    }
                }
            } else {
                result.add("error", new ArrayList<String>(Arrays.asList("Somethings went wrong!")));
            }
            return result;

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    private static ArrayList<MetaData> buildListMetaData(Object obj) {
        try {
            ArrayList<MetaData> metaList = new ArrayList<MetaData>();
            if (obj != null) {
                Field[] fields = obj.getClass().getDeclaredFields();
                for (Field field : fields) {
                    //annotation of field
                    field.setAccessible(true);
                    Annotation[] annoList = field.getDeclaredAnnotations();
                    ArrayList<ValidationContext> contextList = new ArrayList<ValidationContext>();

                    for (Annotation annotation : annoList) {
                        //check valdate annotation
                        Annotation anno = annotation.annotationType().getAnnotation(Constraint.class);
                        if (anno instanceof Constraint) {
                            contextList.add(new ValidationContext(((Constraint) anno).validatedBy(), annotation));
                        }
                    }
                    field.getName();
                    field.get(obj);
                    MetaData meta = new MetaData(field.getName(), field.get(obj), contextList);
                    metaList.add(meta);
                }
                return metaList;
            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

}
