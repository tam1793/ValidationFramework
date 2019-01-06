/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/**
 *
 * @author tamnnq
 */
public class ValidationFactory {

    private static HashMap<String, Class<? extends AbstractValidation>> executeContent = new HashMap<>();

    public static void init() {

    }

    public static void register(Class<? extends Annotation> annotation, Class<? extends AbstractValidation> validation) {
        executeContent.put(annotation.getName(), validation);
    }

    public static AbstractValidation buildValidation(Annotation annotation) {
        try {
            String annotationClass = annotation.annotationType().getName();
            Class validationClass = executeContent.get(annotationClass);
            if (validationClass == null) {
                System.err.println("Can not get Validation of Annotation " + annotationClass);
                return null;
            }
            return (AbstractValidation) validationClass.newInstance();

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

}
