/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Positive;
import Utils.AnnotationUtils;
import Validation.Validate.PositiveValidate;

/**
 *
 * @author tamnnq
 */
public class PositiveValidation extends AbstractValidation<Positive, PositiveValidate> {

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
    public void init(Positive annotation) {
        super.init(annotation);
        this.message = annotation.message();
        this.target = annotation.target();
    }

    @Override
    protected Class<PositiveValidate> getValidate(Positive annotation) {
        return (Class<PositiveValidate>) AnnotationUtils.getValidateOfAnnotation(annotation);
    }

}
