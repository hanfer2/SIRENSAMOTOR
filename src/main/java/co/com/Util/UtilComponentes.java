/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Util;

import co.com.Objetos.Tblparametrodetalle;
import co.com.Objetos.Tblrol;
import co.com.Service.ParametrosService;
import co.com.ServiceImpl.ParametrosServiceImpl;
import java.util.List;
import java.util.Vector;
import co.com.Objetos.exclusivos.Item;
import co.com.Service.RolService;
import co.com.ServiceImpl.RolServiceImpl;
import java.util.Set;
import javax.transaction.Transactional;
/**
 *
 * @author hangutco
 */
public class UtilComponentes {
    
     @Transactional
    public Vector buildModelParametros(String parametro)
    {
         ParametrosService parametros = new ParametrosServiceImpl();
         Vector model = new Vector();
    
        Set<Tblparametrodetalle> listaDetalle = parametros.findByHead(parametro);
         
         for(Tblparametrodetalle detalle : listaDetalle )
         {
         model.addElement( new Item(detalle.getId(), detalle.getDescripcionDetalle() ) );
         }
         
         return model;
    }
     @Transactional
    public Vector buildModelRoles()
    {
         RolService parametros = new RolServiceImpl();
         Vector model = new Vector();
    
        List<Tblrol> listaDetalle = parametros.findByHead();
         
         for(Tblrol rol : listaDetalle )
         {
            model.addElement( new Item(rol.getId(), rol.getNombreRol() ) );
         }
         
         return model;
    }
}
