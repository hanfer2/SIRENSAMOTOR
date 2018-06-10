/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Service;

import co.com.Objetos.Tblparametrodetalle;
import java.util.List;
import java.util.Set;

/**
 *
 * @author hangutco
 */
public interface ParametrosService {
    
    
    
  Set findByHead(String param);
  
  Tblparametrodetalle findById(int id);
}
