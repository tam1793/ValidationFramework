/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.lang.annotation.Annotation;

/**
 *
 * @author tamnnq
 */
public abstract class AbstractValidation<T extends Annotation> {

    abstract protected void init(T annotation);

    abstract protected String getMessage(T annotation);
    
    abstract protected String getTarget(T annotation);

}
