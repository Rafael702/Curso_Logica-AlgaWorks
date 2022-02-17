package exercicio3;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 1 � 7 para aparecer o dia da Semana escolhido:");
		Integer diaDaSemana = sc.nextInt();
		
		
		String dia = "";
		
		switch(diaDaSemana) {
		case 1:
			dia = "DOMINGO";
			break;
		case 2: 
			dia = "SEGUNDA-FEIRA";
			break;
		case 3: 
			dia = "TER�A-FEIRA";
			break;
		case 4:
			dia = "QUARTA-FEIRA";
			break;
		case 5:
			dia = "QUINTA-FEIRA";
			break;
		case 6:
			dia = "SEXTA-FEIRA";
			break;
		case 7:
			dia = "S�BADO";
			break;
			default:
				System.err.println("Digite um n�mero de 1 � 7");
				System.exit(1);
		}
		
		System.out.println("O dia Da Semana Escolhido Foi: " + dia);
		
		sc.close();
		
	}

}
