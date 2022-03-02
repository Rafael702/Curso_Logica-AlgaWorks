package bibliotecaexterna;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Postman {
	static void enviar(String para,String assunto, String mensagem) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("rafaeldealmeida.192001", "3tncHyqbHS"));
		email.setSSLOnConnect(true);
		email.setFrom("rafaeldealmeida.192001@gmail.com");
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(para);
		email.send();
		
		System.out.println("Enviado");
	}
}
