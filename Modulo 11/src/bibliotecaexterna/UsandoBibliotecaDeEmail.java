package bibliotecaexterna;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {	
	public static void main(String[] args) throws EmailException {
			
		String destinario = "rafael.santosdealmeida.31@gmail.com";
		String assunto = "Trolagem";
		String mensagem = "Zueira;-)";
		
		for(int x = 0; x <= 5; x++) {			
			Postman.enviar(destinario,assunto,mensagem);
		}
		
		
		System.out.println("FIM");
	}

}
