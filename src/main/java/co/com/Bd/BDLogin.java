/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Bd;

import co.com.Objetos.Tbllogin;
import co.com.Objetos.Tblrol;
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
public class BDLogin {
    
    
     public boolean save(Tbllogin usuario)
    {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Transaction tx = null;
        Session session= null;
        session = sessionFactory.openSession();
      try{
        tx = session.beginTransaction();
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
    
       public boolean delete(Tbllogin login)
    {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Transaction tx = null;
        Session session= null;
        session = sessionFactory.openSession();
      try{
       tx = session.beginTransaction();
        session.delete(login);
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
     
      public boolean update(Tbllogin login)
    {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Transaction tx = null;
        Session session= null;
        session = sessionFactory.openSession();
      try{
        tx = session.beginTransaction();
        session.update(login);
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
  
  public Tbllogin  findUserByUser(String usuario){
     
      Tbllogin tblLogin ;
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = null;
      try{
     
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        Criteria criteria = session.createCriteria(Tbllogin.class);
        criteria.add(Restrictions.eq("usuario", usuario));       
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
    public List<Tbllogin> findAllByIdRol(int rol){
     
      List<Tbllogin> tblLogin ;
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = null;
      try{
     
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        Criteria criteria = session.createCriteria(Tbllogin.class);
        criteria.createCriteria("tblrol").add( Restrictions.eq("id", rol) );
       
        tblLogin = new ArrayList<>( criteria.list());
        
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
