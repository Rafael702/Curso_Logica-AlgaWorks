package bibliotecaexterna;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {	
	public static void main(String[] args) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("rafaeldealmeida.192001", "3tncHyqbHS"));
		email.setSSLOnConnect(true);
		email.setFrom("rafaeldealmeida.192001@gmail.com");
		email.setSubject("Para o Amor da Minha Vida");
		email.setMsg("Foi o último hihihihi;-)");
		email.addTo("ribeirograziele687@gmail.com");
		email.send();
		
		System.out.println("FIM");
	}

}
