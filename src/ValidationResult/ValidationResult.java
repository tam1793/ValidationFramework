/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidationResult;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author tamnnq
 */
public class ValidationResult {

    private Boolean isValid = true;
    private HashMap<String, ArrayList<String>> errorMessage = new HashMap<String, ArrayList<String>>();

    public Boolean getIsValid() {
        return isValid;
    }

    public HashMap<String, ArrayList<String>> getErrorMessage() {
        return errorMessage;
    }

    public void add(String fieldName, ArrayList<String> listMess) {
        this.isValid = false;
        this.errorMessage.put(fieldName, listMess);
    }

}
