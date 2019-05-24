package com.jpa.hibernate.test.orm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        LOGGER.info("Starting Main main");
        //HibernateInsertTester tester = new HibernateInsertTester();
        //tester.startTest();
        HibernateSelectTester selectTester = new HibernateSelectTester();
        selectTester.startTest();
        LOGGER.info("Ending main method ");
    }
}
