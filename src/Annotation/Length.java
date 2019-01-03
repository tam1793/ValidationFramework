/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import Annotation.Length.List;
import Constraint.LengthConstraint;
import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 *
 * @author tamnnq
 */
@Target({FIELD})
@Retention(RUNTIME)
@Repeatable(List.class)
@Constraint(validatedBy = {LengthConstraint.class})
public @interface Length {

    String message() default " field length is invalid.";
    int min() default 0;
    int max() default Integer.MAX_VALUE;
    
    @Target({FIELD})
    @Retention(RUNTIME)
    @interface List {

        Length[] value();
    }
}
