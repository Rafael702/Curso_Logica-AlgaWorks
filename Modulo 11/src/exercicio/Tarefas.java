package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {
	public static List<String> listaDeTarefas(Integer quantidadeTarefas){
		List<String> listaDeTarefas = new ArrayList<>();
		
		Integer contador = 1;
		
		while(contador <= quantidadeTarefas) {
			listaDeTarefas.add(EnvioDeTarefas.scanner("Informe a sua " + contador + "° tarefa:").nextLine());
			
			contador++;
		}
		
		return listaDeTarefas;
	}
}
