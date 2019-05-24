package com.jpa.hibernate.test.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

    public static Session getSession() {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        // Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = configuration.buildSessionFactory(ssr);
        Session session = factory.openSession();
        session.beginTransaction();
        return session;
    }

    public static void closeSession(Session session){
        if(session != null){
            if(session.getTransaction() != null){
                session.getTransaction().commit();
            }
        }
    }
}
