// Chamando classes
import java.util.Scanner;

public class Gradebooktest {
	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	Gradebook myGradebook = new Gradebook();
	
	System.out.println("Por favor digite o nome do seu curso: ");
	String divus = input.nextLine();
	System.out.println();
	
	myGradebook.displayMessage(divus);
	
	
	}

}