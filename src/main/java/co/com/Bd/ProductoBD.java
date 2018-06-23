/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Bd;


import co.com.Objetos.Tblproducto;
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
public class ProductoBD {

    public boolean save(Tblproducto tblproducto) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            session.save(tblproducto);

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

    public boolean update(Tblproducto tblproducto) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {

            tx = session.beginTransaction();
            session.update(tblproducto);
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

    public boolean delete(Tblproducto tblproducto) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {

            tx = session.beginTransaction();
            session.delete(tblproducto);
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

    public List<Tblproducto> findByFilter(String filter) {

        List<Tblproducto> tblproducto;
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = null;
        try {

            session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            tblproducto = new ArrayList<>(session.createCriteria(Tblproducto.class).add(Restrictions.or(
                    Restrictions.like("referencia", "%" + filter + "%"),
                    Restrictions.like("descripcion", "%" + filter + "%")
            )).list());

            tx.commit();
            session.close();

            return tblproducto;
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
    }

    public List<Tblproducto> findAll() {

        List<Tblproducto> tblproducto;
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = null;
        try {

            session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            tblproducto = new ArrayList<Tblproducto>(session.createCriteria(Tblproducto.class).list());

            tx.commit();
            session.close();

            return tblproducto;
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
    }

    public Tblproducto find(int id) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Criteria criteria = session.createCriteria(Tblproducto.class);
        criteria.add(Restrictions.eq("id", id));

      
        Tblproducto tblproducto = (Tblproducto) criteria.uniqueResult();

        tx.commit();
        session.close();

        return tblproducto;
    }
    
}
