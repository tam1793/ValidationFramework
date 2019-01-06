/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation.Validate;

import Utils.FieldUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 *
 * @author tamnnq
 */
public abstract class AbstractValidate<T extends Annotation> {

    private String TARGET_PATTERN= "this(.([a-z]|[0-9]){1,}){0,}";
    public boolean validate(Object object, Field field, String target) {
        try {
            if(!target.matches(TARGET_PATTERN)){
                System.out.println("TARGET INVALID");   
            }
            field.setAccessible(true);

            if (target.equals("this")) {
                Object result = field.get(object);
                return validate(result);
            } else {
                Object result = FieldUtils.getField(target.substring(5), field.get(object));
                return validate(result);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public abstract void init(T annotation);

    protected abstract boolean validate(Object value);
}
