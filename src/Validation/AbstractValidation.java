/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Validation.Validate.AbstractValidate;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 *
 * @author tamnnq
 */
public abstract class AbstractValidation<T extends Annotation, K extends AbstractValidate> {

    private AbstractValidate<T> validate;

    public void init(T annotation) {
        try {
            Class<K> validateClass = getValidate(annotation);
            this.validate = (K) validateClass.newInstance();
            this.validate.init(annotation);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    abstract public String getMessage();

    abstract protected String getTarget();

    abstract protected Class<K> getValidate(T annotation);

    public boolean execute(T annotation, Object obj, Field field) {
        try {
            init(annotation);
            return this.validate.validate(obj, field, getTarget());
        } catch (Exception ex) {
            System.err.println("ERROR: " + ex.getMessage());
        }
        return false;

    }
}
