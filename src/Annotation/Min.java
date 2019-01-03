/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import Annotation.Min.List;
import Constraint.MinConstraint;
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
@Constraint(validatedBy = {MinConstraint.class})
public @interface Min {

    String message() default " field value is too small.";
    
    int value();
    
    @Target({FIELD})
    @Retention(RUNTIME)
    @interface List {

        Min[] value();
    }
}
