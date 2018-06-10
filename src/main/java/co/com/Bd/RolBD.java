/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Bd;

import co.com.Objetos.Tblparametrodetalle;
import co.com.Objetos.Tblrol;
import co.com.config.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hangutco
 */
public class RolBD {
    

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
      
}
