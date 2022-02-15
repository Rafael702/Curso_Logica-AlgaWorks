package exercicio1;

import java.util.Scanner;

public class Calculadora {
	
	static final Integer OPCAO_UM_ADICAO = 1;
	static final Integer OPCAO_DOIS_SUBTRACAO = 2;
	static final Integer OPCAO_TRES_MULTIPLICACAO = 3;
	static final Integer OPCAO_QUATRO_DIVISAO = 4;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		int primeiroNumeroParaCalculo = sc.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		int segundoNumeroParaCalculo = sc.nextInt();
		
		int total = 0;
		
		String simbolo = " ";
		
		
		System.out.println("Informe a Opera��o matem�tica que voc� deseja realizar: ");
		System.out.println("1 - Adi��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
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
				simbolo = " � ";
				total = primeiroNumeroParaCalculo / segundoNumeroParaCalculo;
				System.out.println( primeiroNumeroParaCalculo + simbolo + segundoNumeroParaCalculo + " = " + total);
				break;
			}else {
				System.out.println("Digite um n�mero V�lido!");
			}
		}
		
		System.out.println("Fim do Programa!");
		
		sc.close();
	
	}

}
