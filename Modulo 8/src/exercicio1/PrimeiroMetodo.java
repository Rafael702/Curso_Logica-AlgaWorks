package exercicio1;

import java.util.Scanner;

public class PrimeiroMetodo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		imprimirVetores(cursos);

		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 
		
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");
		
		imprimirVetores(formasPagamento);

		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 
		
		if (!posicaoValida) {
			encerrarProgramaQuandoAPosicaoEstiverInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}
	
	static void imprimirVetores(String[] vetor) {
			incrementarVetor(vetor, 0);
	}
	
	static void incrementarVetor(String[] vetor, Integer i) {
		System.out.println("[" + i + "] " + vetor[i]);
		
		if(++i < vetor.length) {
			incrementarVetor(vetor, i);
		}

	}
	
	static void encerrarProgramaQuandoAPosicaoEstiverInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}

}
