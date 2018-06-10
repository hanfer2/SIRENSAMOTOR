/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Bd;

import co.com.Objetos.Tblparametro;
import co.com.Objetos.Tblparametrodetalle;
import co.com.config.NewHibernateUtil;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hangutco
 */
public class ParametrosBD {
    

      public  Set<Tblparametrodetalle> find(String param)
    {
       
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        Criteria criteria = session.createCriteria(Tblparametro.class);
        criteria.add(Restrictions.eq("descripcion", param));
        
        Tblparametro parametro = (Tblparametro) criteria.uniqueResult();
        
        
        Set<Tblparametrodetalle> objDetalle = new HashSet(parametro.getTblparametrodetalles());
        tx.commit();
        session.close();
       
        return objDetalle;
    }
      
      
     public  Tblparametrodetalle find(int id)
    {
       
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        Criteria criteria = session.createCriteria(Tblparametrodetalle.class);
        criteria.add(Restrictions.eq("id", id));
        
        Tblparametrodetalle parametrodetalle = new Tblparametrodetalle();
        
        Tblparametrodetalle tempo = (Tblparametrodetalle)criteria.uniqueResult();
      
        parametrodetalle.setDescripcionDetalle(tempo.getDescripcionDetalle());
        parametrodetalle.setId(tempo.getId());
        parametrodetalle.setTblparametro(tempo.getTblparametro());
        
        tx.commit();
        session.close();
       
        return parametrodetalle;
    }
      
}
