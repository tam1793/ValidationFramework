/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import Annotation.NotNull.List;
import Constraint.NotNullConstraint;
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
@Constraint(validatedBy = {NotNullConstraint.class})
public @interface NotNull {

    String message() default "NotNull";

    @Target({FIELD})
    @Retention(RUNTIME)
    @interface List {

        NotNull[] value();
    }
}
