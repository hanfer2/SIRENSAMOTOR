/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ServiceImpl;

import co.com.Bd.BDLogin;
import co.com.Bd.UsuarioBD;
import co.com.Objetos.Tbllogin;
import co.com.Objetos.Tblusuario;
import co.com.Service.LoginService;
import co.com.Service.UsuarioService;
import co.com.config.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UsuarioServiceImpl implements UsuarioService {


    @Override
    public boolean save(Tblusuario usuario, Tbllogin login) {
    
        UsuarioBD usuarioBd = new UsuarioBD();
        return usuarioBd.save(usuario, login);
        
    }
    
    @Override
    public List<Tblusuario> findAll() {
        UsuarioBD bdGeneral = new UsuarioBD();
               
        List<Tblusuario> objDetalle = new ArrayList(bdGeneral.findAll());
        
        return  objDetalle;
    }

 
}
