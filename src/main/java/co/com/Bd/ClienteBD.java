/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Bd;


import co.com.Objetos.Tblcliente;
import co.com.Objetos.Tbllogin;
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

    public boolean save(Tblcliente tblcliente) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            session.save(tblcliente);

            tx.commit();

            return true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
            // throw new RuntimeException(e);
        } finally {
            session.close();
        }
    }

    public boolean update(Tblcliente tblcliente) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {

            tx = session.beginTransaction();
            session.update(tblcliente);
            tx.commit();
            return true;

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
            // throw new RuntimeException(e);
        } finally {
            session.close();
        }
    }

    public boolean delete(Tblcliente tblcliente) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {

            tx = session.beginTransaction();
            session.delete(tblcliente);
            tx.commit();
            return true;

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
            // throw new RuntimeException(e);
        } finally {
            session.close();
        }
    }

    public List<Tblcliente> findByFilter(String filter) {

        List<Tblcliente> tblcliente;
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = null;
        try {

            session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            tblcliente = new ArrayList<>(session.createCriteria(Tblcliente.class).add(Restrictions.or(
                    Restrictions.like("identificacion", "%" + filter + "%"),
                    Restrictions.like("nombreCliente", "%" + filter + "%"),
                    Restrictions.like("telefono", "%" + filter + "%"),
                    Restrictions.like("celular", "%" + filter + "%"),
                    Restrictions.like("email", "%" + filter + "%")
            )).list());

            tx.commit();
            session.close();

            return tblcliente;
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
    }

    public List<Tblcliente> findAll() {

        List<Tblcliente> tblcliente;
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = null;
        try {

            session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            tblcliente = new ArrayList<Tblcliente>(session.createCriteria(Tblcliente.class).list());

            tx.commit();
            session.close();

            return tblcliente;
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
    }

    public Tblcliente find(int id) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Criteria criteria = session.createCriteria(Tblcliente.class);
        criteria.add(Restrictions.eq("id", id));

      
        Tblcliente tblcliente = (Tblcliente) criteria.uniqueResult();

        tx.commit();
        session.close();

        return tblcliente;
    }
    
}
