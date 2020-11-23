package dao;


import models.Auto;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AutoDao {

    public Auto findAutoById(int auto_id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class, auto_id);
    }

    public void save(Auto auto) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(auto);
        tx1.commit();
        session.close();
    }

    public void update(Auto auto) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(auto);
        tx1.commit();
        session.close();
    }

    public void delete(Auto auto) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(auto);
        tx1.commit();
        session.close();
    }

    public User findUserByAutoId(int auto_id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class, auto_id).getUser();
    }

    public List<Auto> findAllAutos() {
        List<Auto> autos = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("FROM Auto").list();
        return autos;
    }

}
