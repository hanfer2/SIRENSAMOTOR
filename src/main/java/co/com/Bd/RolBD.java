/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Bd;

import co.com.Objetos.Tbllogin;
import co.com.Objetos.Tblparametrodetalle;
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
public class RolBD {
    

      public  List<Tblrol> findAll()
    {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
       List<Tblrol> roles = new ArrayList(session.createCriteria(Tblrol.class).list());
        
        tx.commit();
        session.close();
       
        return roles;
    }
           public  List<Tblrol> find()
    {
       
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
       List<Tblrol> roles = new ArrayList(session.createCriteria(Tblrol.class).list());
        
        tx.commit();
        session.close();
       
        return roles;
    }
      public  List<Tblrol> findByFilter(String filtro)
    {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        
        Criteria criteria = session.createCriteria(Tblrol.class);
        criteria.add(Restrictions.like("nombreRol", "%"+filtro+"%"));
        
       List<Tblrol>  roles = new ArrayList<>(criteria.list() );
        
        tx.commit();
        session.close();
       
        return roles;
    }
      
      
        public  Tblrol find(int id)
    {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        Criteria criteria = session.createCriteria(Tblrol.class);
        criteria.add(Restrictions.eq("id", id));
        
        Tblrol rol = new Tblrol();
        
        Tblrol tempo = (Tblrol)criteria.uniqueResult();
      
        rol.setNombreRol(tempo.getNombreRol());
        rol.setId(tempo.getId());
        
        tx.commit();
        session.close();
       
        return rol;
    }
      
    public boolean save(Tblrol rol)
    {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
           
      try{
        tx = session.beginTransaction();

        session.save(rol);
        
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
    
   public boolean update(Tblrol rol)
   {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
           
      try{
        tx = session.beginTransaction();
      
        session.update(rol);
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
   public boolean delete(Tblrol rol)
   {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
           
      try{
        tx = session.beginTransaction();
      
        session.delete(rol);
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
}
