/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.MaxInteger;
import Utils.AnnotationUtils;
import Validate.MaxIntegerValidate;

/**
 *
 * @author tamnnq
 */
public class MaxIntegerValidation extends AbstractValidation<MaxInteger, MaxIntegerValidate> {

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
    public void init(MaxInteger annotation) {
        this.message = annotation.message();
        this.target = annotation.target();
    }

    @Override
    protected Class<MaxIntegerValidate> getValidate(MaxInteger annotation) {
        return (Class<MaxIntegerValidate>) AnnotationUtils.getValidateOfAnnotation(annotation);

    }

}
