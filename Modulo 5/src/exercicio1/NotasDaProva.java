package exercicio1;

import java.util.Scanner;

public class NotasDaProva {
	static final Double NOTA_MINIMA_DAS_MATERIAS = 60.0;
	static final Double NOTA_MINIMA_DA_PROVA = 150.0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Nota de Portugu�s:");
		Double notaPortugues = sc.nextDouble();
		
		System.out.println("Digite a Nota de Matem�tica: ");
		Double notaMatematica = sc.nextDouble();
		
		Boolean notaMinimaDePortugues = notaPortugues >= NOTA_MINIMA_DAS_MATERIAS;
		Boolean notaMinimaDeMatematica = notaMatematica >= NOTA_MINIMA_DAS_MATERIAS;
		
		Double notaFinalDaProva = notaPortugues + notaMatematica;
		
		Boolean notaDaProvaMenorOuIgualANotaMinima = notaFinalDaProva >= NOTA_MINIMA_DA_PROVA;
		
		if(notaMinimaDePortugues && notaMinimaDeMatematica) {
			if(notaDaProvaMenorOuIgualANotaMinima) {
				System.out.println("PARAB�NS VOC� FOI APROVADO!!!!");
				System.out.println("Sua Nota Foi: " + notaFinalDaProva);
			}else {
				System.out.println("Voc� Foi Reprovado. O Minimo Para Passar � " + NOTA_MINIMA_DA_PROVA);
			}
		}else {
			System.out.println("Voc� Foi Reprovado. Em Cada Mat�ria Voc� deve tirar no Minimo 60 de Nota. ");
			System.out.println("NOTAS: " + "\nPortugu�s: " + notaPortugues + "\nMatem�tica: " + notaMatematica);
		}
		
		sc.close();	
		
	}

}
