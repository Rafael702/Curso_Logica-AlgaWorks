package exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EnvioDeTarefas {
	public static void main(String[] args) throws Exception {
		Path path = Paths.get("C:\\Users\\rafael.almeida\\Desktop\\Others\\AlgaWorks\\Logica De Programacao\\Modulo 11\\src"
				+ "\\exercicio\\tarefas.txt");
		
		Integer quantidadeTarefas = scanner("Quantas tarefas você deseja inserir?").nextInt();
		
		Files.write(path,Tarefas.listaDeTarefas(quantidadeTarefas));
		
		String tarefas = tarefasDaLista(Files.readAllLines(path));
		
		Postman.enviar(tarefas);
		
		scanner("Fim").close();
		
	}
	
	public static Scanner scanner(String mensagem) {
		System.out.println(mensagem);
		return new Scanner(System.in);
	}
	
	public static String tarefasDaLista(List<String> listaComTarefas) {
		
		String tarefa = "";

		for(int i = 0; i < listaComTarefas.size(); i++) {
			tarefa += (i+1) + "°: " + listaComTarefas.get(i) + "\n";
		}
		
		return tarefa;
	}
	
}
