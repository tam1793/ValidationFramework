/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Email;
import Validate.AbstractValidate;
import Validate.EmailValidate;

/**
 *
 * @author tamnnq
 */
public class EmailValidation extends AbstractValidation<Email,EmailValidate> {

    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private String message;
    
    @Override
    protected AbstractValidation init(Email annotation) {
        this.message = annotation.message();
        return null;
    }

    @Override
    protected String getMessage(Email annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Email annotation) {
        return annotation.target();
    }

    @Override
    protected Class<? extends AbstractValidate> getValidate(Email annotation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected EmailValidate init(Email annotation, AbstractValidate validate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
