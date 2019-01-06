/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Validate.AbstractValidate;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 *
 * @author tamnnq
 */
public abstract class AbstractValidation<T extends Annotation> {

    abstract protected AbstractValidate init(T annotation);

    abstract protected String getMessage(T annotation);

    abstract protected String getTarget(T annotation);

    abstract protected Class<? extends AbstractValidate> getValidate(T annotation);

    public boolean execute(T annotation, Object obj, Field field) {
        try {
            Class validateClass = getValidate(annotation);
            AbstractValidate validate = validateClass.g
            AbstractValidate validate = validateClass
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;

    }
}
