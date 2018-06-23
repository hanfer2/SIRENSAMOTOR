/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ServiceImpl;

import co.com.Bd.ProductoBD;
import co.com.Objetos.Tblproducto;
import co.com.Service.ProductoService;
import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {


    @Override
    public boolean save(Tblproducto tblproducto) {
    
        ProductoBD usuarioBd = new ProductoBD();
        return usuarioBd.save(tblproducto);
    }
    
    @Override
    public boolean delete(Tblproducto tblproducto) {
    
        ProductoBD usuarioBd = new ProductoBD();
        return usuarioBd.delete(tblproducto);
    }
    
    @Override
    public boolean update(Tblproducto tblproducto) {
    
        ProductoBD usuarioBd = new ProductoBD();
        return usuarioBd.update(tblproducto);
    }
    
    @Override
    public List<Tblproducto> findAll() {
        ProductoBD bdGeneral = new ProductoBD();
               
        List<Tblproducto> objDetalle = new ArrayList(bdGeneral.findAll());
        
        return  objDetalle;
    }
    @Override
    public List<Tblproducto> findByFilter(String filter) {
        ProductoBD bdGeneral = new ProductoBD();
               
        List<Tblproducto> objDetalle = new ArrayList(bdGeneral.findByFilter(filter));
        
        return  objDetalle;
    }

  @Override
    public Tblproducto findId(int id) {
        ProductoBD bdGeneral = new ProductoBD();
               
       Tblproducto objDetalle =  bdGeneral.find(id);
        
        return  objDetalle;
    }
}
