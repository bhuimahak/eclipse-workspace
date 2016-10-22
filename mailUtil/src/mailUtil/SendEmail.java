package mailUtil;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmail {

	public static void main(String[] args) {

		String userName = "bhuimahak";
		String password = "Meh@405805";

		// Recipient's email id
		String to = "qadriarslan@gmail.com;qadriarslan@outlook.com;qadriarslan@yahoo.com";

		// sender's email id
		String from = "bhuimahak@gmail.com";

		// sending email from localhost
		String host = "smtp.gmail.com";
		String port = "587";

		// get system properties
		Properties properties = new Properties();
		// setup mail server
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.user", userName);
		properties.put("mail.smtp.password", password);
		properties.put("mail.smtp.starttls.enable", true);

		// get default session object
		Session session = Session.getInstance(properties, null);

		try {
			// create a default MimeMessage object
			MimeMessage message = new MimeMessage(session);

			// set From:header field of the header
			message.setFrom(new InternetAddress(from));

			// set From:header field of the header
			String[] toAddresses = to.split(";");
			for (String toAddress : toAddresses) {
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
			}

			// setSubject
			message.setSubject("this is a subject 2");

			BodyPart messageBodyPart = new MimeBodyPart();
			// Fill the message
			messageBodyPart.setText("This is message body");

			// Part two is attachment
			BodyPart attachmentBodyPart = new MimeBodyPart();
			String filename = "C:\\Users\\mahabhui\\Desktop\\Questions.txt";
			attachmentBodyPart.setDataHandler(new DataHandler(new FileDataSource(filename)));
			attachmentBodyPart.setFileName("Questions.txt");

			// Create a multipart message
			Multipart multipart = new MimeMultipart();
			// Set text message part
			multipart.addBodyPart(messageBodyPart);
			multipart.addBodyPart(attachmentBodyPart);

			// setText
			message.setContent(multipart);

			// SendMessage
			Transport transport = session.getTransport("smtps");
			transport.connect(host, userName, password);
			transport.sendMessage(message, message.getAllRecipients());

			System.out.println("Sent message succssfully");

		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
	}

}
