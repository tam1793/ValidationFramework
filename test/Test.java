
import Annotation.Constraint;
import Annotation.Max;
import Annotation.Min;
import Annotation.NotNull;
import Constraint.ConstraintInterface;
import ValidationResult.ValidationResult;
import ValidationContext.MetaData;
import ValidationContext.ValidationContext;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tamnnq
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    static class User {

        @NotNull()
        String name;

        @NotNull()
        @Min(15)
        @Max(30)
        Integer age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

    }

    public static ValidationResult validate(ArrayList<MetaData> metaList) {
        try {
            ValidationResult result = new ValidationResult();
            for (MetaData data : metaList) {
                ArrayList<ValidationContext> consList = data.getConstraints();
                for (int i = 0; i < consList.size(); i++) {
                    ArrayList<String> errorMess = new ArrayList<String>();
//                    Class c = consList.get
                    ValidationContext context = consList.get(i);
//                    Class ann = context.getAnnotation();
                    ConstraintInterface con = (ConstraintInterface) context.getConstraint().newInstance();
                    Annotation annoTest = context.getAnnotation();
                    con.initialize(annoTest);
                    Boolean isValid = con.isValid(data.getValue());
                    if (!isValid) {
//                        Object annoTest.annotationType().getClass();
                        Method[] methods = annoTest.annotationType().getMethods();
                        for (Method method : methods) {
                            if (method.getName().equals("message")) {
                                String mess = (String) method.invoke(annoTest);
//                        System.out.println("mess: " + mess);
//                        errorMess.add(annoTest.annotationType().getField("String").);
                                System.err.println("mess: " + mess);
                            }
                        }

                    }
//                    ConstraintInterface constraint = (ConstraintInterface) c.newInstance();
////                    ConstraintInterface cons = consList.get(i);
//                    constraint.initialize(annotation);
                    System.out.println("validate: " + con.isValid(data.getValue()));
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            User u = new User(null, 35);
            ArrayList<MetaData> metaList = new ArrayList<MetaData>();
            Field[] fields = u.getClass().getDeclaredFields();
            for (Field f : fields) {
                //annotation of field
                Annotation[] listAnno = f.getDeclaredAnnotations();
                ArrayList<ValidationContext> list = new ArrayList<>();

                for (Annotation cons : listAnno) {
                    //check valdate annotation
                    Annotation anno = cons.annotationType().getAnnotation(Constraint.class);
                    if (anno instanceof Constraint) {
                        list.add(new ValidationContext(((Constraint) anno).validatedBy(), cons));
                    }
                }
                MetaData meta = new MetaData(f.getName(), f.get(u), list);
                metaList.add(meta);
//            Annotation anno = f.getAnnotation(Constraint.class);
//            if (anno instanceof Constraint) {
//                MetaData meta = MetaData(f.getType(), f.get(u), new ArrayList<>);
//            }
            }

            //validate
            validate(metaList);

            System.err.println("----");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
