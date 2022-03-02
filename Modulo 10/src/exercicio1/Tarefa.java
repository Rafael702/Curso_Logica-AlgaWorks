package exercicio1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		Path path = Paths.get("C:\\Users\\rafael.almeida\\Desktop\\Others\\AlgaWorks\\Logica De Programacao\\Modulo 10\\src\\texto.txt");
				
		ArrayList<String> lista = new ArrayList<>();
		
		
		String option = "s";
		
		while(!option.equalsIgnoreCase("x")) {
			System.out.println("Informe a sua tarefa: ");
			lista.add(sc.nextLine());
			
			Files.write(path, lista);
			
			System.out.println("Digite: s para adicionar outra tarefa ou x para sair do programa.");
			option = sc.nextLine();

		}

		List<String> tarefas = new ArrayList<>();
		tarefas.addAll(Files.readAllLines(path));
		
		if(!tarefas.isEmpty()) {
			System.out.println("Tarefas contando na lista:");
			
			for(String referencia: tarefas) {
				System.out.println(referencia);
			}
		}else {
			System.out.println("Nenhuma Tarefa Foi Registrada");
		}
		
			
	}
}
