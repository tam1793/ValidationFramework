/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.NonDigitString;
import Utils.AnnotationUtils;
import Validation.Validate.NonDigitStringValidate;

/**
 *
 * @author tamnnq
 */
public class NonDigitStringValidation extends AbstractValidation<NonDigitString, NonDigitStringValidate> {

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
    public void init(NonDigitString annotation) {
        super.init(annotation);
        this.message = annotation.message();
        this.target = annotation.target();
    }

    @Override
    protected Class<NonDigitStringValidate> getValidate(NonDigitString annotation) {
        return (Class<NonDigitStringValidate>) AnnotationUtils.getValidateOfAnnotation(annotation);

    }
}
