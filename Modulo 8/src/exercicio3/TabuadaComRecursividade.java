package exercicio3;

import java.util.Scanner;

public class TabuadaComRecursividade {
	public static void main(String[] args) {
		
		Integer multiplicador = entrarComDadosDoUsuario("Digite um numero da tabuada que deseja:").nextInt(); 
		
		multiplicarNumero(multiplicador);
		
	}
	
	static Scanner entrarComDadosDoUsuario(String mensagem) {
		System.out.println(mensagem);
		return new Scanner(System.in);
	}
	
	static void multiplicarNumero(Integer multiplicador) {
		incrementarMultiplicao(multiplicador, 0);
		
	}
	
	static void incrementarMultiplicao(Integer multiplicador, Integer limite) {
		
	System.out.println(multiplicador + " x " + limite + " = " + operarMultiplicao(multiplicador, limite));
	
	if(++limite <= 10) {
		incrementarMultiplicao(multiplicador, limite);
	}
	
	}
	
	static Integer operarMultiplicao(Integer multiplicador, Integer limite) {
		return multiplicador * limite;
	}

}
