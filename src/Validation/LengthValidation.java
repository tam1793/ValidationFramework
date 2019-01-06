/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Length;
import Utils.AnnotationUtils;
import Validate.AbstractValidate;
import Validate.EmailValidate;
import Validate.LengthValidate;

/**
 *
 * @author tamnnq
 */
public class LengthValidation extends AbstractValidation<Length, LengthValidate> {

    String message;
    String target;

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    protected String getTarget() {
        return target;
    }

    @Override
    public void init(Length annotation) {
        this.message = annotation.message();
        this.target = annotation.target();
    }

    @Override
    protected Class<LengthValidate> getValidate(Length annotation) {
        return (Class<LengthValidate>) AnnotationUtils.getValidateOfAnnotation(annotation);
    }

}
