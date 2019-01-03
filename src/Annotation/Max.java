/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import Annotation.Max.List;
import Constraint.MaxConstraint;
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
@Constraint(validatedBy = {MaxConstraint.class})
public @interface Max {

    String message() default " field value is too big.";
    
    int value();
    
    @Target({FIELD})
    @Retention(RUNTIME)
    @interface List {

        Max[] value();
    }
}
