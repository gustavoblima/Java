import java.util.Scanner;
import javax.swing.JOptionPane;

public class gustavotest {
	public static void main (String args []) {
	Scanner input = new Scanner( System.in );
	
	
	// int x,y, soma;
	final int z;
	
	z = 30;
	JOptionPane.showMessageDialog(null, "Bem vindo ao programa de Teste do Gustavo");
	/*
	System.out.print("Digite um numero: " );
	x = input.nextInt();
	System.out.print("Digite outro numero: ");
	y = input.nextInt();
	*/
	
	String numb1 = 
		JOptionPane.showInputDialog("Digite um numero: ");
	String numb2 = 
		JOptionPane.showInputDialog("Digite outro numero: ");
	int x = Integer.parseInt(numb1);
	int y = Integer.parseInt(numb2);
	int soma = x + y;
	
	
	/*Sm.out.println("A Soma dos numeros digitados sao: ");
	System.out.println(x + " + " + y + "  -->  " + soma); */
	
	JOptionPane.showMessageDialog(null, "A Soma dos numeros e: " + soma );
	
	// Se z for diferente "!= " da soma
	// Se z for igual " == " a soma 

	if (z != soma) {    
		System.out.println("");
		System.out.println("z é diferente da soma:  " + z + " ---->  " + soma);
		System.out.println("******     *******    *******   *******");
		System.out.println("*     *   *       *   *         *");
		System.out.println("*     *   *       *   *         *");
		System.out.println("******    *********   *******   *******");
		System.out.println("*         *       *         *         *");
		System.out.println("*         *       *   *******   *******");
		
	
		} 
		else { 
		 System.out.println("");
		 System.out.println("z é igual a soma:  " + z + "---->  " + soma);
		}
	
	//System.out.println("*\n**\n***\n****\n*****");
	
	
	}

}
