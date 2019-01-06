/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import Validation.Validate.LengthValidate;
import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 *
 * @author tamnnq
 */
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = LengthValidate.class)
public @interface Length {

    String target() default "this";

    String message() default "This field length is invalid.";

    int min() default 0;

    int max() default Integer.MAX_VALUE;
}
