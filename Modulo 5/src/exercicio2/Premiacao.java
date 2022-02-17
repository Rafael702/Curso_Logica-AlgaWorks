package exercicio2;

import java.util.Scanner;

public class Premiacao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta de faturamento para esse ano: ");
		Double meta = scanner.nextDouble();
		
		System.out.print("Digite o faturamento: ");
		Double faturamento = scanner.nextDouble();
		
		System.out.print("Digite a m�dia salarial dos �ltimos 12 meses: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Double oitentaPorCentoDaMeta = (meta * 80) / 100;
		
		Boolean bateuAMeta = faturamento >= meta;
		
		Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
		
		if (bateuAMeta) {
			System.out.println("Voc� vai ganhar um b�nus de 100%! Ele ser� de: " + mediaSalarial);
		} else if (faturouPeloMenosOitentaPorCento) {
			Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100;
			
			System.out.println("Voc� vai ganhar um b�nus de 80%! Ele ser� de: " + oitentaPorCentoDaMediaSalarial);
		} else {
			System.out.println("Infelizmente, esse ano n�o tem b�nus!");
		}		
		
		scanner.close();
	}
}
