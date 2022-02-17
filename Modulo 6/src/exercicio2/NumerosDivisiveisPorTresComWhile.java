package exercicio2;

public class NumerosDivisiveisPorTresComWhile {

	final static Integer DIVISOR = 3;
	public static void main(String[] args) {

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		Integer contador = 0;
		
		while(contador < numeros.length) {
			
			Integer numero = numeros[contador];
			Integer moduloPorTres = numero % DIVISOR;
			
			if(moduloPorTres.equals(0)) {
				System.out.println(numeros[contador]);
			}
			contador++;
		}
		System.out.println("Fim");
	}

}
