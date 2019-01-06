/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author tamnnq
 */
public class EmptyValidate extends AbstractValidate {

    @Override
    protected boolean validate(Object value) {
        if(value instanceof String){
            return !value.equals("");
        } else if(value instanceof Collection){
            return ((Collection) value).size() != 0;
        } else if(value instanceof Map){
            return ((Map) value).size() != 0;
        }
        return false ;
    }
}
