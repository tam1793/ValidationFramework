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
    private String message;
    private String target;

    @Override
    protected String getMessage() {
        return this.message;
    }

    @Override
    protected String getTarget() {
        return this.target;
    }

    @Override
    protected Class<? extends AbstractValidate> getValidate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(Email annotation) {
        this.message = annotation.message();
        this.target = annotation.target();
    }
}
