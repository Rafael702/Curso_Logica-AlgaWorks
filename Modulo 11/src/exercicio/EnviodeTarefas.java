package exercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EnviodeTarefas {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Path path = Paths.get("C:\\Users\\rafael.almeida\\Desktop\\Others\\AlgaWorks\\Logica De Programacao\\Modulo 11\\src"
				+ "\\exercicio\\tarefas.txt");
		
		System.out.println("Quantas tarefas você deseja inserir?");
		Integer quantidadeTarefas = sc.nextInt();
		
		List<String> listaDeTarefas = new ArrayList<>();
		
		Integer contador = 1;
		
		sc.nextLine();
		
		while(contador <= quantidadeTarefas) {
			System.out.println("Informe a sua " + contador + "° tarefa:");
			listaDeTarefas.add(sc.nextLine());
			
			contador++;
		}
		
		Files.write(path,listaDeTarefas);
		
		List<String> listaComTarefas = Files.readAllLines(path);
		
		Postman.enviar("rafael.santosdealmeida.31@gmail.com","Lista com Tarefas",listaComTarefas.toString());
		
		sc.close();
		System.out.println("FIM");
		
	}
}
