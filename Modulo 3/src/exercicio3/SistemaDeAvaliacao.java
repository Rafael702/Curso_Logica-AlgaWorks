package exercicio3;

import java.util.Scanner;

public class SistemaDeAvaliacao {
	
	static final Integer NOTA_DO_ALUNO_APROVADO = 70; 
	static final Integer QUANTIDADE_DE_NOTAS_A_SER_INSERIDAS = 5;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalNotas = 0;
		
		for (int contador = 1; contador <= QUANTIDADE_DE_NOTAS_A_SER_INSERIDAS; contador++) {
			System.out.println("Digite o " + contador + "° numero: ");
			int n = sc.nextInt();
			
			totalNotas += n;
		}
		
		if(totalNotas > NOTA_DO_ALUNO_APROVADO) {
			System.out.println("Aluno Aprovado!!!");
		} else {
			System.out.println("Aluno Reprovado. Total de Notas: " + totalNotas);
		}
	}

}
