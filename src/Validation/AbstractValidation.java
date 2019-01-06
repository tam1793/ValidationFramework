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
public abstract class AbstractValidation<T extends Annotation, K extends AbstractValidate> {

    abstract protected AbstractValidation init(T annotation);

    abstract protected String getMessage(T annotation);

    abstract protected String getTarget(T annotation);

    abstract protected Class<K> getValidate(T annotation);

    public boolean execute(T annotation, Object obj, Field field) {
        try {
            Class validateClass = getValidate(annotation);
            AbstractValidate validate = (AbstractValidate) validateClass.newInstance();

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;

    }
}
