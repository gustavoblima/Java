import java.util.Scanner;
public class DiaSem {
	public static void main(String[] args){
	
	Scanner tec = new Scanner(System.in);
	
	int ds = 0;
		
	System.out.println("Escolha um numero");
	System.out.println("   01 - Domingo" );
	System.out.println("   02 - Segunda" );
	System.out.println("   03 - Terca" );
	System.out.println("   04 - Quarta" );
	System.out.println("   05 - Quinta" );
	System.out.println("   06 - Sexta" );
	System.out.println("   07 - Sabado" );

	ds = tec.nextInt();
	
		switch (ds){
		case 1:
			System.out.println("numero informado eh " + ds + " dia da semana he Domingo");
			break;
		case 2:
			System.out.println("numero informado eh " + ds + " dia da semana he Segunda");
			break;
		case 3:
			System.out.println("numero informado eh " + ds + " dia da semana he Terça");
			break;
		case 4:
			System.out.println("numero informado eh " + ds + " dia da semana he Quarta");
			break;
		case 5:
			System.out.println("numero informado eh " + ds + " dia da semana he Quinta");
			break;
		case 6:
			System.out.println("numero informado eh " + ds + " dia da semana he Sexta");
			break;
		case 7:
			System.out.println("numero informado eh " + ds + " dia da semana he Sábado");
			break;
		default:
			System.out.println("numero informado eh " + ds + " dia invalido");
			break;
		}
	}
}