/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Email;
import Utils.AnnotationUtils;
import Validation.Validate.AbstractValidate;
import Validation.Validate.EmailValidate;

/**
 *
 * @author tamnnq
 */
public class EmailValidation extends AbstractValidation<Email,EmailValidate> {
    private String message;
    private String target;

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    protected String getTarget() {
        return this.target;
    }

    @Override
    public void init(Email annotation) {
        super.init(annotation);
        this.message = annotation.message();
        this.target = annotation.target();
    }

    @Override
    protected Class<EmailValidate> getValidate(Email annotation) {
        return (Class<EmailValidate>) AnnotationUtils.getValidateOfAnnotation(annotation);
    }
}
