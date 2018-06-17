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
import co.com.config.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LoginServiceImpl implements LoginService {

    @Override
    public boolean validarLogin(Tbllogin login) {
      
     BDLogin bdLogin = new BDLogin();
        
     Tbllogin tblLogin=  bdLogin.findUserPass(login.getUsuario(), login.getPasswords());      
       
       if(tblLogin !=null)
       {
       return true;
       }else
       {
       return false;
       }
    }

    @Override
    public Tbllogin finUser(String user, String pass) {
        BDLogin bdLogin = new BDLogin();
        
     return   bdLogin.findUserPass(user, pass);
    }

    @Override
    public List<Tbllogin> findAllByIdRol(int id) {
     BDLogin bdGeneral = new BDLogin();
      
        List<Tbllogin> objDetalle = new ArrayList(bdGeneral.findAllByIdRol(id));
        
        return  objDetalle;
    }
}
