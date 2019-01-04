/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import Annotation.NonDigitString.List;
import Constraint.NonDigitStringConstraint;
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
@Constraint(validatedBy = NonDigitStringConstraint.class)
public @interface NonDigitString {

    String message() default " field value must not have digit.";
        
    @Target({FIELD})
    @Retention(RUNTIME)
    @interface List {

        NonDigitString[] value();
    }
}
