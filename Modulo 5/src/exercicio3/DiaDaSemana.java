package exercicio3;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 à 7 para aparecer o dia da Semana escolhido:");
		Integer diaDaSemana = sc.nextInt();
		
		switch(diaDaSemana) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2: 
			System.out.println("SEGUNDA-FEIRA");
			break;
		case 3: 
			System.out.println("TERÇA-FEIRA");
			break;
		case 4:
			System.out.println("QUARTA-FEIRA");
			break;
		case 5:
			System.out.println("QUINTA-FEIRA");
			break;
		case 6:
			System.out.println("SEXTA-FEIRA");
			break;
		case 7:
			System.out.println("SÁBADO");
			break;
			default:
				System.err.println("Digite um número de 1 à 7");
				System.exit(1);
		}
		
		sc.close();
		
	}

}
