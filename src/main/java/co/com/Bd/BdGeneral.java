/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Bd;

import co.com.Objetos.Tblcliente;
import co.com.config.NewHibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hangutco
 */
public class BdGeneral {
    
    
    
    public void create(Object objecto)
    {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(objecto);
        tx.commit();
        session.close();
    }
    

}
