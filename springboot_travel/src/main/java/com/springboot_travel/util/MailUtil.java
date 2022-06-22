package com.springboot_travel.util;


import org.apache.tomcat.util.http.fileupload.util.mime.MimeUtility;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @Classname MailUtil
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/5 20:01
 * @Created by 石傲
 */
public class MailUtil {
    private static ResourceBundle bundle=ResourceBundle.getBundle("mail");
    public static void sendMail(String from,String[] toUsers,String subject,String content,String[] files){
        try {
            Properties properties=new Properties();
            properties.put("mail.smtp.host",bundle.getString("mail.smtp.host"));
            properties.put("mail.smtp.auth",true);
            Authenticator authenticator=new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(bundle.getString("username"), bundle.getString("password"));
                }
            };
            Session session= Session.getDefaultInstance(properties,authenticator);
            Message message = new MimeMessage(session);
            //标题
            message.setSubject(subject);
            //正文
            //message.setText(text);
            //网页....亦可以发普通文本
            Multipart m=new MimeMultipart();
            BodyPart b=new MimeBodyPart();
            b.setContent(content,"text/html;charset=utf-8");
            m.addBodyPart(b);

            //发附件
            if (null!=files && files.length>0){
                BodyPart b2=new MimeBodyPart();
                for (String file : files) {
                    b2.setDataHandler(new DataHandler(new FileDataSource(new File(file))));
                    //b2.setFileName(MimeUtility.encodeText(MimeUtility.encodeText(new File(file).getName())));
                    b2.setFileName(MimeUtility.decodeText(MimeUtility.decodeText(new File(file).getName())));
                    m.addBodyPart(b2);
                }
            }
            message.setContent(m);

            //发送者
            InternetAddress address1 = new InternetAddress(from);
            message.setFrom(address1);
            //接受者
            InternetAddress[] addresses=new InternetAddress[toUsers.length];
            for (int i = 0; i < toUsers.length; i++) {
                addresses[i]=new InternetAddress(toUsers[i]);
            }
            message.setRecipients(Message.RecipientType.TO,addresses);
            //发送邮件
            Transport.send(message);
        } catch (MessagingException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
