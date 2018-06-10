/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Service;

import co.com.Objetos.Tblrol;
import java.util.List;
import java.util.Set;

/**
 *
 * @author hangutco
 */
public interface RolService {
    
    
    
  List<Tblrol> findByHead();
  Tblrol findById(int id); 
}
