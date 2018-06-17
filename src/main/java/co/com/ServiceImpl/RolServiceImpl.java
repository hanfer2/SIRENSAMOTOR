package co.com.ServiceImpl;

import co.com.Bd.BdGeneral;
import co.com.Bd.ParametrosBD;
import co.com.Bd.RolBD;
import co.com.Objetos.Tbllogin;
import co.com.Objetos.Tblparametro;
import co.com.Objetos.Tblparametrodetalle;
import co.com.Objetos.Tblrol;
import co.com.Objetos.Tblusuario;
import co.com.Service.ParametrosService;
import co.com.Service.RolService;
import co.com.config.NewHibernateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hangutco
 */
public class RolServiceImpl implements RolService{

    
    
     @Override
    @Transactional
    public List<Tblrol> findByHead() 
    {
        RolBD bdGeneral = new RolBD();
               
        List<Tblrol> objDetalle = new ArrayList(bdGeneral.find());
        
        return  objDetalle;
    }
    
    @Override
    public List<Tblrol>  findByFilter(String filter){
         RolBD parametro = new RolBD();  
         List<Tblrol> objDetalle = new ArrayList( parametro.findByFilter(filter));
        return  objDetalle;
    } 
   
   
    public List<Tblrol>  findAll(){
         RolBD parametro = new RolBD();  
         List<Tblrol> objDetalle = new ArrayList(parametro.findAll());
        return  objDetalle;
   
    } 
    
     @Override
    public Tblrol findById(int id) {
        RolBD parametro = new RolBD();  
        Tblrol objDetalle = parametro.find(id);
        return  objDetalle;
    }
    
       @Override
    public boolean save(Tblrol rol) {
    
         RolBD parametro = new RolBD();  
        return parametro.save(rol);
    }
    
    @Override
    public boolean delete(Tblrol rol) {
    
        RolBD parametro = new RolBD();  
        return parametro.delete(rol);
    }
    
    @Override
    public boolean update(Tblrol rol) {
    
         RolBD parametro = new RolBD();  
        return parametro.update(rol);
    }
}
