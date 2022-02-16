package exercicio3;

import java.util.Scanner;

public class Conta {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double valorTotalDasContas = 0.0;
		
		System.out.println("Informe o valor da sua conta de luz:");
		Double valorContaDeLuz = sc.nextDouble();
		valorTotalDasContas += valorContaDeLuz;
		
		System.out.println("Informe o valor da sua conta de agua:");
		Double valorContaDeAgua = sc.nextDouble();
		valorTotalDasContas += valorContaDeAgua;
		
		System.out.println("Informe o valor da sua conta de telefone:");
		Double valorContaDeTelefone = sc.nextDouble();
		valorTotalDasContas += valorContaDeTelefone;
		
		System.out.println("Informe o valor da escola do seu filho:");
		Double valorEscola = sc.nextDouble();
		valorTotalDasContas += valorEscola;
		
		System.out.println("Informe o valor da fatura do cartão:");
		Double valorFaturaDoCartao = sc.nextDouble();
		valorTotalDasContas += valorFaturaDoCartao;
		
		System.out.println("Informe o valor dos gastos com o supermercado:");
		Double valorGastosNoSupermercado = sc.nextDouble();
		valorTotalDasContas += valorGastosNoSupermercado;
		
		System.out.println("Total de Gastos>>> " + valorTotalDasContas);
		
		
	}

}
