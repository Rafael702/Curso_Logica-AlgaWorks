package exercicio2;

import java.util.Scanner;

public class Calculadora {
	static final Integer ADICAO = 1;
	static final Integer SUBTRACAO = 2;
	
	
	public static void main(String[] args) {
		
		int numero1 =  entrarComDadosDoUsuario("Digite o primeiro n�mero:").nextInt();
		int numero2 = entrarComDadosDoUsuario("Digite o segundo n�mero:").nextInt();
		
		System.out.println("Qual operacao Matematica Voc� Deseja?");
		int opcao = entrarComDadosDoUsuario("1 - Adi��o | 2 - Subtra��o: ").nextInt();
		
		String resultadoDoCalculo = opcoesDeCalculo(opcao, numero1, numero2);
		
		System.out.println(resultadoDoCalculo);
	}
	

	static Scanner entrarComDadosDoUsuario(String mensagem) {
		System.out.println(mensagem);
		return new Scanner(System.in);
	}
	
	static String opcoesDeCalculo(Integer opcao, Integer numero1, Integer numero2) {
		String resultado = "";
		if(opcao == ADICAO) {
			resultado = operarAdicaoNoCalculo(numero1, numero2);
		}else if(opcao == SUBTRACAO) {
			resultado = operarSubtracaoNoCalculo(numero1, numero2);
		}else {
			System.err.print("Digite Uma Op��o V�lida Entre 1 e 2.");
			System.exit(0);
		}
		
		return resultado;
	}
	
	static String operarAdicaoNoCalculo(Integer numero1, Integer numero2) {
		
		return numero1 +  " + " + numero2 + " = " + (numero1 + numero2);
	}
	
	
	static String operarSubtracaoNoCalculo(Integer numero1, Integer numero2) {
		if(numero1 < numero2) {
			return numero2 + " - " +  numero1 + " = " + (numero2 - numero1);
		}
		return numero1 + " - " +  numero2 + " = " + (numero1 - numero2);
	}
}

