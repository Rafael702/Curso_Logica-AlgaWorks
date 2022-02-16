package exercicio4;

import java.util.Scanner;

public class Aposentadoria {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Informe A Sua Idade:");
		Integer idade = sc.nextInt();
		
		System.out.println("Informe O tempo que você contribuiu com a previdência:");
		Integer contribuicao = sc.nextInt();
		
		Boolean podeAposentar = idade >= 55 && contribuicao >= 25;
		
		if(podeAposentar) {
			System.out.println("O Sr(a) Pode Aposentar!!!!");
		} else {
			System.out.println("O Sr(a) Não Pode Aposentar, pois é necessário ter 55 anos de idade e 25 anos de contribuição "
					+ "com a previdência");
		}
	}

}
