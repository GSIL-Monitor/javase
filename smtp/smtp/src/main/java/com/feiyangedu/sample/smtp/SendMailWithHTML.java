package com.feiyangedu.sample.smtp;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailWithHTML {

	public static void main(String[] args) throws Exception {
		SendMail sender = new SendMail("smtp.qq.com", "ywy0012006@qq.com", "xywocjsofwdvbibc");
		Session session = sender.createSSLSession();
		Message message = createHtmlMessage(session, "ywy0012006@qq.com", "yangwenyuan@mistong.com", "Java HTML邮件",
				"<h1>Hello</h1><p>这是一封<u>javamail</u>测试邮件！</p>");
		Transport.send(message);
	}

	static Message createHtmlMessage(Session session, String from, String to, String subject, String body)
			throws MessagingException {
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		message.setSubject(subject, "UTF-8");
		message.setText(body, "UTF-8", "html");
		return message;
	}

}
