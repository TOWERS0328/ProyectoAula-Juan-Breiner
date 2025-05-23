/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.user.util.validations;

import Interface.utils.validations.IEmailValidation;

public class EmailValidationHandler implements IEmailValidation {

    @Override
    public boolean isEmailValid(String email) {
        
        int cantidadArrobas = email.length() - email.replace("@", "").length();
        if (cantidadArrobas != 1) {
            return false;
        }
        
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }
}
