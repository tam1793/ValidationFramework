/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidationContext;

import Constraint.ConstraintInterface;
import java.lang.annotation.Annotation;

/**
 *
 * @author tamnnq
 */
public class ValidationContext {

    Class<? extends ConstraintInterface<?, ?>> constraint;
    Annotation annotation;

    public ValidationContext(Class<? extends ConstraintInterface<?, ?>> constraint, Annotation annotation) {
        this.constraint = constraint;
        this.annotation = annotation;
    }

    public Class<? extends ConstraintInterface<?, ?>> getConstraint() {
        return constraint;
    }

    public Annotation getAnnotation() {
        return annotation;
    }

}
