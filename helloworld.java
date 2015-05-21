import java.util.Scanner;

public class helloworld {
	public static void main (String args[]) {
	
	Scanner input = new Scanner ( System.in );
	
	int x;
	int y; 
	int soma;
	
		System.out.println("Digite um numero: ");
		x = input.nextInt();
	
		System.out.println("Digite outro numero: ");
		y = input.nextInt();
	
		soma = x + y;
	
	System.out.println ("A Soma é:" + soma);
	
	}
	

} 