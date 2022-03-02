package exercicio;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Postman {
	static void enviar(String mensagem) throws Exception {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("rafaeldealmeida.192001", "3tncHyqbHS"));
		email.setSSLOnConnect(true);
		email.setFrom("rafaeldealmeida.192001@gmail.com");
		email.setSubject(informarAssunto());
		email.setMsg(mensagem);
		email.addTo(informarEmailDestino());
		carregarEnvioDeMensagem();
		email.send();
		
		
	}
	
	static String informarEmailDestino() {
		return EnvioDeTarefas.scanner("Informe o email de destino:").next();
	}
	
	static String informarAssunto() {
		return EnvioDeTarefas.scanner("Informe o assunto de destino:").next();
	}
	
	static void carregarEnvioDeMensagem() throws Exception{
		System.out.print("Enviando");
		
		for(int i = 0; i <= 3; i++) {
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("Email Enviado Com Sucesso!!!");

	}
}
