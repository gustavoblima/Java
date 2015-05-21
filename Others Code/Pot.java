import java.util.Scanner;
public class Pot {
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
			
		double base = 0; 
		double exp = 0; 
		double resultado = 0;
		
		System.out.println("informe a base");
		base = tec.nextDouble();

		System.out.println("informe o expoente");
		exp = tec.nextDouble();
		
		System.out.println("a base informada eh " + base);
		System.out.println("o expoente informado eh " + exp);
		
		for (int x = 1; x <= exp; x++){
		base = base * exp;
		}
		
		System.out.println("o resultado informado eh " + base);
		
	}
} 