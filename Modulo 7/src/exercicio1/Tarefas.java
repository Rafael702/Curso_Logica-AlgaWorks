package exercicio1;

import java.util.Scanner;

public class Tarefas {
	final static Integer LIMITE = 5;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] tarefas = new String[5]; 
		
		String novaTarefa;
		
		for(int tarefa = 0; tarefa < LIMITE; tarefa++) {
			for(int contador = tarefa + 1; contador <= tarefa+1; contador++) {
				System.out.println("Informe a " + (tarefa + 1) + "� tarefa mais importante do seu dia: " );
				novaTarefa = sc.nextLine();								
				tarefas[tarefa] = novaTarefa;
			}
		}
		
		System.out.println("Tarefas Cadastradas: ");
		for(int exibicaoDaTarefa = 0; exibicaoDaTarefa < LIMITE; exibicaoDaTarefa++) {
			System.out.println(tarefas[exibicaoDaTarefa]);
		}
		
		sc.close();
		System.out.println("Fim");
	}

}
