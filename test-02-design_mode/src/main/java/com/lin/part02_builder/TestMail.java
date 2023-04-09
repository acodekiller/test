package com.lin.part02_builder;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.util.Properties;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/9 17:12
 */
public class TestMail implements Serializable {

    public void test() throws Exception {
        Properties properties = new Properties();
        Session session = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(session);
        InternetAddress from = new InternetAddress("sunny@test.com");
        message.setFrom(from);

    }



}
