/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Bd;

import co.com.Objetos.Tbllogin;
import co.com.Objetos.Tblusuario;
import co.com.config.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hangutco
 */
public class ClienteBD {
    
    
   public boolean save(Tblusuario usuario, Tbllogin login)
    {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
           
        BDLogin loginbd = new BDLogin();
      try{
        tx = session.beginTransaction();
        
        loginbd.save(login);
        
        usuario.setTbllogin(loginbd.findUserByUser(login.getUsuario()));
        
        session.save(usuario);
        
        tx.commit();
       
        return true;
      }catch(HibernateException e)
      {
          if(tx != null)
          {
          tx.rollback();
          }
          return false;
         // throw new RuntimeException(e);
      }finally{
          session.close();
        }
      }
    
   public boolean update(Tblusuario usuario, Tbllogin login)
    {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
           
        BDLogin loginbd = new BDLogin();
      try{
       boolean res= loginbd.update(login);
       if(res )
       {
        tx = session.beginTransaction();
        usuario.setTbllogin(loginbd.findUserByUser(login.getUsuario()));
        session.update(usuario);
        tx.commit();
        return true;
       }else
       {
       return false;
       }
      }catch(HibernateException e)
      {
          if(tx != null)
          {
          tx.rollback();
          }
          return false;
         // throw new RuntimeException(e);
      }finally{
          session.close();
        }
      }
   
  public boolean delete(Tblusuario usuario, Tbllogin login)
    {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
           
        BDLogin loginbd = new BDLogin();
      try{
       boolean res= loginbd.delete(login);
       if(res )
       {
        tx = session.beginTransaction();
        usuario.setTbllogin(loginbd.findUserByUser(login.getUsuario()));
        session.delete(usuario);
        tx.commit();
        return true;
       }else
       {
       return false;
       }
      }catch(HibernateException e)
      {
          if(tx != null)
          {
          tx.rollback();
          }
          return false;
         // throw new RuntimeException(e);
      }finally{
          session.close();
        }
      }
   
     public List<Tbllogin>  findByFilter(String filter){
     
      List<Tbllogin> tblLogin ;
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = null;
      try{
     
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
                 
        tblLogin = new ArrayList<>(session.createCriteria(Tblusuario.class).add(Restrictions.or(
                Restrictions.like("nombres", "%"+filter+"%"),
                Restrictions.like("apellidos", "%"+filter+"%"),
                Restrictions.like("identificacion", "%"+filter+"%")
        )).list() );
        
        tx.commit();
        session.close();
        
        return tblLogin;
        }catch(HibernateException e)
          {
          e.printStackTrace();
          session.getTransaction().rollback();
          return null;
          }
    } 
   
   
    public List<Tbllogin>  findAll(){
     
      List<Tbllogin> tblLogin ;
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = null;
      try{
     
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        tblLogin =new ArrayList<Tbllogin>( session.createCriteria(Tblusuario.class).list());
        
        tx.commit();
        session.close();
        
        return tblLogin;
        }catch(HibernateException e)
          {
          e.printStackTrace();
          session.getTransaction().rollback();
          return null;
          }
    } 
    
    
  public Tbllogin  findUserPass(String usuario, String pass){
     
      Tbllogin tblLogin ;
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = null;
      try{
     
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        Criteria criteria = session.createCriteria(Tbllogin.class);
        criteria.add(Restrictions.eq("usuario", usuario));
        criteria.add(Restrictions.eq("passwords", pass));
       
        tblLogin = (Tbllogin) criteria.uniqueResult();
        
        tx.commit();
        session.close();
        
        return tblLogin;
        }catch(HibernateException e)
          {
          e.printStackTrace();
          session.getTransaction().rollback();
          return null;
          }
    }
    
}
