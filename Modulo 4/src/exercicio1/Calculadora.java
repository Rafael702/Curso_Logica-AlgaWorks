package exercicio1;

import java.util.Scanner;

public class Calculadora {
	
	static final Integer OPCAO_UM_ADICAO = 1;
	static final Integer OPCAO_DOIS_SUBTRACAO = 2;
	static final Integer OPCAO_TRES_MULTIPLICACAO = 3;
	static final Integer OPCAO_QUATRO_DIVISAO = 4;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o primeiro número: ");
		int primeiroNumeroParaCalculo = sc.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int segundoNumeroParaCalculo = sc.nextInt();
		
		int total = 0;
		
		String simbolo = " ";
		
		
		System.out.println("Informe a Operação matemática que você deseja realizar: ");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		int opcao = sc.nextInt();
		
		Boolean chave = false;
		while(chave == false) {
			
			if(opcao == OPCAO_UM_ADICAO) {
				simbolo = " + ";
				total = primeiroNumeroParaCalculo + segundoNumeroParaCalculo;
				System.out.println( primeiroNumeroParaCalculo + simbolo + segundoNumeroParaCalculo + " = " + total);
				break;
				
			}else if(opcao == OPCAO_DOIS_SUBTRACAO) {		
				simbolo = " - ";
				total = primeiroNumeroParaCalculo - segundoNumeroParaCalculo;
				System.out.println( primeiroNumeroParaCalculo + simbolo + segundoNumeroParaCalculo + " = " + total);
				break;
			}else if(opcao == OPCAO_TRES_MULTIPLICACAO) {
				simbolo = " * ";
				total = primeiroNumeroParaCalculo * segundoNumeroParaCalculo;
				System.out.println( primeiroNumeroParaCalculo + simbolo + segundoNumeroParaCalculo + " = " + total);
				break;
			}else if(opcao == OPCAO_QUATRO_DIVISAO) {
				simbolo = " ÷ ";
				total = primeiroNumeroParaCalculo / segundoNumeroParaCalculo;
				System.out.println( primeiroNumeroParaCalculo + simbolo + segundoNumeroParaCalculo + " = " + total);
				break;
			}else {
				System.out.println("Digite um número Válido!");
			}
		}
		
		System.out.println("Fim do Programa!");
		
		sc.close();
	
	}

}
