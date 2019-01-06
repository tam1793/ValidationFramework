/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import Utils.FieldUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 *
 * @author tamnnq
 */
public abstract class AbstractValidate<T extends Annotation>{

    public boolean validate(Object object, Field field, String target) {
        try {
            if (target.equals("this")) {
                Object result = field.get(object);
                return validate(result);
            } else {
                //Find value from path target
                Object result = FieldUtils.getField(target.substring(2), field.get(object));
                return validate(result);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public abstract AbstractValidate init(T annotation);
    protected abstract boolean validate(Object value);
}
