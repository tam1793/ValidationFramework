/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Email;

/**
 *
 * @author tamnnq
 */
public class EmailValidation extends AbstractValidation<Email> {

    private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    protected void init(Email annotation) { }

    @Override
    protected String getMessage(Email annotation) {
        return annotation.message();
    }

    @Override
    protected String getTarget(Email annotation) {
        return annotation.target();
    }
}
