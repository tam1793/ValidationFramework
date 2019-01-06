/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.lang.reflect.Field;

/**
 *
 * @author tamnnq
 */
public class FieldUtils {

    public static Object getField(String path, Object obj) {
        try {
            if (obj == null) {
                return obj;
            }
            String[] fieldsNames = path.split("\\.");
            Class<?> targetClass = obj.getClass();
            for (String fieldName : fieldsNames) {
                Field field = getFieldByName(targetClass, fieldName);
                targetClass = field.getType();
                obj = getFieldValue(obj, field);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    private static Field getFieldByName(Class<?> targetClass, String fieldName)
            throws Exception {
        return targetClass.getDeclaredField(fieldName);
    }

    private static Object getFieldValue(Object obj, Field field) throws Exception {
        field.setAccessible(true);
        return field.get(obj);
    }
}
