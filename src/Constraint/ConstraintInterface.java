/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constraint;

import java.lang.annotation.Annotation;

/**
 *
 * @author tamnnq
 */
public interface ConstraintInterface<T extends Annotation, K> {

    void initialize(T annotation);

    boolean isValid(K value);
}
