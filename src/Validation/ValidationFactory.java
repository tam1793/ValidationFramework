/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.*;
import java.lang.annotation.Annotation;
import java.util.HashMap;

/**
 *
 * @author tamnnq
 */
public class ValidationFactory {

    private static HashMap<String, Class<? extends AbstractValidation>> executeContent = new HashMap<>();

    public static void init() {
        executeContent.put(Email.class.getName(), EmailValidation.class);
//        executeContent.put(Empty.class.getName(), EmailValidation.class);
        executeContent.put(Length.class.getName(), LengthValidation.class);
        executeContent.put(MaxInteger.class.getName(), MaxIntegerValidation.class);
        executeContent.put(MinInteger.class.getName(), MinIntegerValidation.class);
        executeContent.put(NonDigitString.class.getName(), NonDigitStringValidation.class);
        executeContent.put(NotNull.class.getName(), NotNullValidation.class);
        executeContent.put(Positive.class.getName(), PositiveValidation.class);
        executeContent.put(Regex.class.getName(), RegexValidation.class);
    }

    public static void register(Class<? extends Annotation> annotation, Class<? extends AbstractValidation> validation) {
        executeContent.put(annotation.getName(), validation);
    }

    public static AbstractValidation buildValidation(Annotation annotation) {
        try {
            String annotationClass = annotation.annotationType().getName();
            Class validationClass = executeContent.get(annotationClass);
            if (validationClass == null) {
                return null;
            }
            return (AbstractValidation) validationClass.newInstance();

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

}
