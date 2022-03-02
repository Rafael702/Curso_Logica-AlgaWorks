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
		
		List<String> listaComTarefas = Files.readAllLines(path);
		
		Postman.enviar("rafael.santosdealmeida.31@gmail.com","Lista com Tarefas",listaComTarefas.toString());
		
		scanner("Fim").close();
		
	}
	
	public static Scanner scanner(String mensagem) {
		System.out.println(mensagem);
		return new Scanner(System.in);
	}
	
	
}
