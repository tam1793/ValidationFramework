/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import Annotation.Pattern.List;
import Constraint.PatternConstraint;
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
@Constraint(validatedBy = PatternConstraint.class)
public @interface Pattern {

    String message() default " field value is invalid pattern format.";
    
    String value();
    
    @Target({FIELD})
    @Retention(RUNTIME)
    @interface List {

        Pattern[] value();
    }
}
