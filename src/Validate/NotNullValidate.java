/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;

/**
 *
 * @author tamnnq
 */
public class NotNullValidate extends AbstractValidate {

    @Override
    protected boolean validate(Object value) {
        return value != null;
    }

}
