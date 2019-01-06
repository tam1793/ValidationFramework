/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Annotation.Regex;
import Utils.AnnotationUtils;
import Validate.RegexValidate;

/**
 *
 * @author tamnnq
 */
public class RegexValidation extends AbstractValidation<Regex, RegexValidate> {

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
    public void init(Regex annotation) {
        this.message = annotation.message();
        this.target = annotation.target();
    }

    @Override
    protected Class<RegexValidate> getValidate(Regex annotation) {
        return (Class<RegexValidate>) AnnotationUtils.getValidateOfAnnotation(annotation);
    }

}
