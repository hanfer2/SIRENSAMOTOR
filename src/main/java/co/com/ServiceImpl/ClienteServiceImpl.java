/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ServiceImpl;

import co.com.Bd.BDLogin;
import co.com.Bd.ClienteBD;
import co.com.Bd.UsuarioBD;
import co.com.Objetos.Tblcliente;
import co.com.Objetos.Tbllogin;
import co.com.Objetos.Tblusuario;
import co.com.Service.ClienteService;
import co.com.Service.LoginService;
import co.com.Service.UsuarioService;
import co.com.config.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClienteServiceImpl implements ClienteService {


    @Override
    public boolean save(Tblcliente tblCliente) {
    
        ClienteBD usuarioBd = new ClienteBD();
        return usuarioBd.save(tblCliente);
    }
    
    @Override
    public boolean delete(Tblcliente tblCliente) {
    
        ClienteBD usuarioBd = new ClienteBD();
        return usuarioBd.delete(tblCliente);
    }
    
    @Override
    public boolean update(Tblcliente tblCliente) {
    
        ClienteBD usuarioBd = new ClienteBD();
        return usuarioBd.update(tblCliente);
    }
    
    @Override
    public List<Tblcliente> findAll() {
        ClienteBD bdGeneral = new ClienteBD();
               
        List<Tblcliente> objDetalle = new ArrayList(bdGeneral.findAll());
        
        return  objDetalle;
    }
    @Override
    public List<Tblcliente> findByFilter(String filter) {
        ClienteBD bdGeneral = new ClienteBD();
               
        List<Tblcliente> objDetalle = new ArrayList(bdGeneral.findByFilter(filter));
        
        return  objDetalle;
    }

  @Override
    public Tblcliente findId(int id) {
        ClienteBD bdGeneral = new ClienteBD();
               
       Tblcliente objDetalle =  bdGeneral.find(id);
        
        return  objDetalle;
    }
}
