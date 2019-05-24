package com.jpa.hibernate.test.orm;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateInsertTester {

    private static Logger LOG = LoggerFactory.getLogger(HibernateInsertTester.class);

    public void startTest() {
        LOG.info("HibernateInsertTester :: startTest :: start");
        Session session = HibernateSession.getSession();

        for(int i = 1; i <= 10000; i++) {
            User user = new User();
            user.setId(i);
            user.setUsername(DataGenerator.getString());
            user.setPassword(DataGenerator.getString());
            user.setFirstName(DataGenerator.getString());
            user.setLastName(DataGenerator.getString());
            user.setEmail(DataGenerator.getEmailId());

            Address address = new Address();
            address.setId(i);
            address.setAddress1(DataGenerator.getString());
            address.setAddress2(DataGenerator.getString());
            address.setCity(DataGenerator.getString());
            address.setState(DataGenerator.getString());
            address.setCountry(DataGenerator.getString());
            address.setPostalCode(DataGenerator.getPhoneNumber());

            address.setUser(user);

            session.persist(address);
        }

        HibernateSession.closeSession(session);

        LOG.info("HibernateInsertTester :: startTest :: ends");
    }
}
