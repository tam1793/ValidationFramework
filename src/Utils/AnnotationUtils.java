/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Annotation.Constraint;
import Validation.Validate.AbstractValidate;
import java.lang.annotation.Annotation;

/**
 *
 * @author tamnnq
 */
public class AnnotationUtils {

    public static Class<? extends AbstractValidate> getValidateOfAnnotation(Annotation annotation) {
        try {
            Annotation anno = annotation.annotationType().getAnnotation(Constraint.class);
            if (anno instanceof Constraint) {
                return ((Constraint) anno).validatedBy();
            }

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
        return null;
    }
}
