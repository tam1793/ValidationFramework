/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.MaxInteger;
import Validate.MaxIntegerValidate;

/**
 *
 * @author tamnnq
 */
public class MaxIntegerValidation extends AbstractValidation<MaxInteger,MaxIntegerValidate> {

    private int max;

    @Override
    protected void init(MaxInteger annotation) {
        max = annotation.value();
        return null;
    }

    @Override
    protected String getMessage(MaxInteger annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(MaxInteger annotation) {
        return annotation.target();
    }

    @Override
    protected Class<? extends AbstractValidate> getValidate(Max annotation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
