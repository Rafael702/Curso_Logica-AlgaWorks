package exercicio3;

public class Piramide {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
			if(i > 1) {
				for(char a = 1; a <= i; a++) {
					System.out.print("#");
				}	
				System.out.print("$");
				for(char a = 1; a <= i; a++) {
					System.out.print("#");
				}	
				System.out.println(i);
			}else {
				System.out.print("$");
				System.out.println(i);
			}
			
		}
	}

}
/*
1$1
2##$##2
3###$###3
*/