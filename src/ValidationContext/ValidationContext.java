/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidationContext;

import Validation.AbstractValidation;
import java.lang.annotation.Annotation;

/**
 *
 * @author tamnnq
 */
public class ValidationContext {

    Class<? extends AbstractValidation<?, ?>> validator;
    Annotation annotation;

    public ValidationContext(Class<? extends AbstractValidation<?, ?>> validator, Annotation annotation) {
        this.validator = validator;
        this.annotation = annotation;
    }

    public Class<? extends AbstractValidation<?, ?>> getValidator() {
        return validator;
    }

    public Annotation getAnnotation() {
        return annotation;
    }
    
}
