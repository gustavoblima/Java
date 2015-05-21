import java.util.Scanner;
import javax.swing.JOptionPane;

public class Marceneiro {
	public static void main ( String[] args) {
	
		Scanner input = new Scanner( System.in );
		JOptionPane.showMessageDialog(null, "Bem vindo a Marcenaria do Gustavo");
	
	String numb1 = 
		JOptionPane.showInputDialog("Digite o tamanho da Tabua em cm:    ");
	String numb2 = 
		JOptionPane.showInputDialog("Qual o tamanho do pedaco? em cm:    ");
	//String numb3 = 
		//JOptionPane.showInputDialog("Quantos pedacos de Madeira deseja? : " );
	int x = Integer.parseInt(numb1);
	int y = Integer.parseInt(numb2);
	int div = x / y;
	double resto;
	resto = x % y;
	
	JOptionPane.showMessageDialog(null, "A Tabua em numero de pedacos -->>  " + div + "   Pedaco(s)");
	JOptionPane.showMessageDialog(null, "A Sobra de madeira em centimetros -->>  " + resto + "  cm");
	
	
	if (resto != 0) {    
		System.out.println("");
		System.out.println("Nao estrague a Madeira: \n TOTAL:  " + x + "cm \n Total da Sobra:->  " + resto + "cm" + " \n TENTE UMA MEDIDA EXATA, PENSE NO MEIO AMBIENTE! ");
		System.out.println("");
		System.out.println("");
		System.out.println("******     *******    *******   *******");
		System.out.println("*     *   *       *   *         *");
		System.out.println("*     *   *       *   *         *");
		System.out.println("******    *********   *******   *******");
		System.out.println("*         *       *         *         *");
		System.out.println("*         *       *   *******   *******");
		
	
		} 
		else { 
		 System.out.println("");
		 System.out.println("Nao Ha sobra de Madeira: \n TOTAL:  " + x + "cm \n Total da Sobra:->  " + resto+ "cm" + "\n PARABENS!");
		 System.out.println("");
		 System.out.println("");
		 System.out.println("******     *******    *******   *******");
		 System.out.println("*     *   *       *   *         *");
		 System.out.println("*     *   *       *   *         *");
		 System.out.println("******    *********   *******   *******");
		 System.out.println("*         *       *         *         *");
		 System.out.println("*         *       *   *******   *******");
		} 
	
	}

}