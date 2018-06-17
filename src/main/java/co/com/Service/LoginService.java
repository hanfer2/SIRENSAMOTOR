/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Service;

import co.com.Objetos.Tbllogin;
import java.util.List;

/**
 *
 * @author hangutco
 */
public interface LoginService {
    
    
  
    boolean  validarLogin(Tbllogin login);
    Tbllogin finUser(String user, String pass);
    List<Tbllogin>  findAllByIdRol(int id);
}
