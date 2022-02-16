package exercicio2;

import java.util.Scanner;

public class ProdutoComFrete {
	static final Double VALOR_DO_FRETE = 15.00;
	static final Double FRETE_GRATIS = 100.00;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Double valorFinal = 0.0;
		
		System.out.println("Informe o valor do produto:");
		Double produto = sc.nextDouble();
		
		Boolean valorDoProdutoMenorQueCem = produto < FRETE_GRATIS;
		
		valorFinal = produto;
		
		if(valorDoProdutoMenorQueCem) {			
			valorFinal = produto + VALOR_DO_FRETE;
			System.out.println("Valor do Produto: " + valorFinal + "\nFrete: " + VALOR_DO_FRETE);

		}else {
			System.out.println("Valor do Produto: " + valorFinal + "\nFrete: 0");
		}
		
		
	}
}
