import java.util.Scanner;

public class Repeticao {
	
	public static void main(String args [] ) {
	
		int rep = 0;
		int atual = 0;
		
			Scanner teclado = new Scanner(System.in);
				System.out.println("Insira um numero de repeticoes");
					rep = teclado.nextInt();
						while(atual <= rep) {
			
								System.out.println("O numero agora eh " + atual);
									atual++;

		}	

	}
	
 }