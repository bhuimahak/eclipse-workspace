package mail.util;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail2 {

	public static void main(String[] args) {

		String userName = "";
		String password = "";

		// Recipient's email id
		String to = "qadriarslan@gmail.com";

		// sender's email id
		String from = "bhuimahak@gmail.com";

		// sending email from localhost
		String host = "smtp.gmail.com";
		String port = "587";

		// get system properties
		Properties properties = new Properties();
		// setup mail server
		properties.setProperty("mail.smtp.host", host);
		properties.setProperty("mail.smtp.port", port);
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");

		// get default session object
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		});

		try {
			// create a default MimeMessage object
			MimeMessage message = new MimeMessage(session);

			// set From:header field of the header
			message.setFrom(new InternetAddress(from));

			// set From:header field of the header
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// setSubject
			message.setSubject("this is a subject");
			
			//setText
			message.setText("This is the message");

			// SendMessage
			Transport.send(message);

			System.out.println("Sent message succssfully");

		} catch (MessagingException ex) {
			ex.printStackTrace();

		}

	}

}
