package exercicio4;

import java.util.Scanner;

public class Aposentadoria {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Informe A Sua Idade:");
		Integer idade = sc.nextInt();
		
		System.out.println("Informe O tempo que voc� contribuiu com a previd�ncia:");
		Integer contribuicao = sc.nextInt();
		
		Boolean podeAposentar = idade >= 55 && contribuicao >= 25;
		
		if(podeAposentar) {
			System.out.println("O Sr(a) Pode Aposentar!!!!");
		} else {
			System.out.println("O Sr(a) N�o Pode Aposentar, pois � necess�rio ter 55 anos de idade e 25 anos de contribui��o "
					+ "com a previd�ncia");
		}
	}

}
