package com.fleamarket.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class SendEmail {
	private static  Properties properties;
	private static	final String mailAddress="1147057783@qq.com";
	private static 	final 	String mailAuthCode="brwcqfaquqxhbaed";
	/**
	 * @param args
	 */
	static{
		properties = new Properties();
		 properties.put("mail.transport.protocol", "smtp");
	        properties.put("mail.smtp.host", "smtp.qq.com");
	        properties.put("mail.smtp.port", "465");
	        properties.put("mail.smtp.auth", "true");
	        properties.put("mail.smtp.ssl.enable", "true");
	        properties.put("mail.debug", "true");
	}
	public static void sendMail(String mailAddr,String title,String content){
		Session session = Session.getInstance(properties);
        Message message = new MimeMessage(session);
        try{
		        message.setFrom(new InternetAddress(mailAddress));
		        message.setRecipients(RecipientType.TO, new InternetAddress[]{
		                new InternetAddress(mailAddr)});
		        message.setSubject(title);
		        message.setText(content);
		        Transport transport = session.getTransport();
		        transport.connect(mailAddress, mailAuthCode);
		        transport.sendMessage(message,message.getAllRecipients());
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendEmail.sendMail("1260591101@qq.com", "生多", "生命aaa");
	}
}
