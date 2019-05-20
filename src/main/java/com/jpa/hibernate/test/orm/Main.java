package com.jpa.hibernate.test.orm;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
      //  Class.forName("com.mysql.cj.jdbc.Driver");
      //  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate_tests","ht_user","Test@123");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
       // Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = configuration.buildSessionFactory(ssr);
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setId(5);
        user.setUsername("sample_90");
        user.setPassword("Test@test123");
        user.setFirstName("sample");
        user.setLastName("90");
        user.setEmail("sample90@hotmail.com");

        session.persist(user);


        Query query = session.createQuery("from User ");
        List<User> users = query.list();

        for(User user1:users){
            System.out.println(user1);
        }

        if(transaction != null){
            transaction.commit();
        }


    }
}