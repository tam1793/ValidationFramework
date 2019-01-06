/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validator;

import Validation.ValidationFactory;
import Validation.AbstractValidation;
import ValidationResult.ValidationResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
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
        if (instance == null) {
            LOCK.lock();
            try {
                if (instance == null) {
                    instance = new Validator();
                    ValidationFactory.init();
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

            if (obj != null) {
                Field[] fields = obj.getClass().getDeclaredFields();

                for (Field field : fields) {
                    ArrayList<String> errorMessage = new ArrayList<String>();
                    Annotation[] annotations = field.getAnnotations();

                    for (Annotation annotation : annotations) {
                        AbstractValidation validation = ValidationFactory.buildValidation(annotation);
                        boolean isValid = validation.execute(annotation, obj, field);
                        if (!isValid) {
                            errorMessage.add(validation.getMessage());
                        }
                    }
                    if (!errorMessage.isEmpty()) {
                        result.add(field.getName(), errorMessage);
                    }
                }

            } else {
                result.add("error", new ArrayList<String>(Arrays.asList("Cannot validate null object")));
            }
            return result;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

}
