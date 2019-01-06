/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Length;
import Validate.AbstractValidate;
import Validate.LengthValidate;

/**
 *
 * @author tamnnq
 */
public class LengthValidation extends AbstractValidation<Length,LengthValidate> {

    private int min;
    private int max;
    String message;

    @Override
    protected String getMessage(Length annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Length annotation) {
        return annotation.target();
    }

    @Override
    protected Class<? extends AbstractValidate> getValidate(Length annotation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(Length annotation) {
        
    }

}
