/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.MinInteger;
import Utils.AnnotationUtils;
import Validate.MinIntegerValidate;

/**
 *
 * @author tamnnq
 */
public class MinIntegerValidation extends AbstractValidation<MinInteger, MinIntegerValidate> {

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
    public void init(MinInteger annotation) {
        this.message = annotation.message();
        this.target = annotation.target();
    }

    @Override
    protected Class<MinIntegerValidate> getValidate(MinInteger annotation) {
        return (Class<MinIntegerValidate>) AnnotationUtils.getValidateOfAnnotation(annotation);

    }

}
