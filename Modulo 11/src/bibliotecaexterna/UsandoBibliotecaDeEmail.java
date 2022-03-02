package bibliotecaexterna;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {	
	public static void main(String[] args) throws EmailException {
			
		String destinario = "ribeirograziele687@gmail.com";
		String assunto = "Para o Amor da Minha Vida";
		String mensagem = "Te amoooooooo❤;-)";
		
		Postman.enviar(destinario,assunto,mensagem);
		
		System.out.println("FIM");
	}

}
