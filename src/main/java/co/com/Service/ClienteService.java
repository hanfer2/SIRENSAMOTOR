/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Service;

import co.com.Objetos.Tblcliente;
import co.com.Objetos.Tbllogin;
import co.com.Objetos.Tblusuario;
import java.util.List;

/**
 *
 * @author hangutco
 */
public interface ClienteService {
    
    
   boolean save(Tblcliente usuario);
   boolean delete(Tblcliente usuario);
   boolean update(Tblcliente usuario);
   List<Tblcliente> findAll();
   List<Tblcliente> findByFilter(String filter);
   Tblcliente findId(int id);
    
}
