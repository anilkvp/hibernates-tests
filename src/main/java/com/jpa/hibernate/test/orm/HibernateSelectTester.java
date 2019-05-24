package com.jpa.hibernate.test.orm;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HibernateSelectTester {

    private static final Logger LOG = LoggerFactory.getLogger(HibernateSelectTester.class);

    public void startTest() {
        LOG.info("HibernateSelectTester :: startTest :: starts ");

        Session session = HibernateSession.getSession();

        printAddress(session);

        LOG.info("HibernateSelectTester :: startTest :: ends ");
    }

    private void printUser(Session session){
        Query query = session.createQuery("u from User");

        List<User> users = query.list();

        for(User user: users){
            LOG.debug(user.toString());
        }
    }

    private void printAddress(Session session) {
        Query query = session.createQuery("from Address");

        List<Address> addresses = query.list();

        for(Address address: addresses){
            LOG.info(address.toString());
        }
    }
}
