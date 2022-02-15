package defaultpackage;

import java.util.Scanner;

public class CalcularValorProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = sc.nextDouble();
		
		System.out.println("Digite a quantidade passada pelo cliente: ");
		Double valorPassadoPeloCliente = sc.nextDouble();
		
		Double resultado = valorPassadoPeloCliente  - valorProduto;
		
		System.out.println("Troco: " + resultado);
		sc.close();
	}

}
