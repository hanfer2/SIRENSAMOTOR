/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Service;

import co.com.Objetos.Tblproducto;
import java.util.List;

/**
 *
 * @author hangutco
 */
public interface ProductoService {
    
    
   boolean save(Tblproducto usuario);
   boolean delete(Tblproducto usuario);
   boolean update(Tblproducto usuario);
   List<Tblproducto> findAll();
   List<Tblproducto> findByFilter(String filter);
   Tblproducto findId(int id);
    
}
