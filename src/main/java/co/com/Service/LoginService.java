/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Service;

import co.com.Objetos.Tbllogin;

/**
 *
 * @author hangutco
 */
public interface LoginService {
    
    
    void createUSer(Tbllogin login);
    boolean  validarLogin(Tbllogin login);
    Tbllogin finUser(String user, String pass);
}
