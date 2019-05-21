package com.jpa.hibernate.test.orm;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class DataGenerator {

    public static String getString() {
        return RandomStringUtils.randomAlphabetic(4, 15);
    }

    public static String getEmailId() {
        String[] domain = {"gmail.com", "yahoo.com", "net.com", "bell.com"};

        Random random = new Random();
        int pos = random.nextInt(4);
        return getString()+"@"+domain[pos];
    }

    public static String getPhoneNumber(){
        return RandomStringUtils.randomNumeric(10,10);
    }


}
