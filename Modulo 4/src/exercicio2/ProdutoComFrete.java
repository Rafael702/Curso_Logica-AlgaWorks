package exercicio2;

import java.util.Scanner;

public class ProdutoComFrete {
	static final Double FRETE_GRATIS = 100.00;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Double valorFinal = 0.0;
		Double valorDoFrete = 0.0;
		
		System.out.println("Informe o valor do produto:");
		Double produto = sc.nextDouble();
		
		Boolean valorDoProdutoMenorQueCem = produto < FRETE_GRATIS;
		
		valorFinal = produto;
		
		if(valorDoProdutoMenorQueCem) {		
			valorDoFrete = 15.00;
			valorFinal = produto + valorDoFrete;
			System.out.println("Valor do Produto: " + valorFinal + "\nFrete: " + valorDoFrete);

		}else {
			System.out.println("Valor do Produto: " + valorFinal + "\nFrete: "  + valorDoFrete);
		}
		
		
	}
}
