/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Service;

import co.com.Objetos.Tbllogin;
import co.com.Objetos.Tblusuario;
import java.util.List;

/**
 *
 * @author hangutco
 */
public interface UsuarioService {
    
    
   boolean save(Tblusuario usuario, Tbllogin login);
   List<Tblusuario> findAll();
   
    
}
