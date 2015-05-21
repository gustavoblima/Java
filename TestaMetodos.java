import java.util.Scanner;
public class TestaMetodos {
	public static void main (String [] args) {
		Scanner tec = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("informe o numero: ");
		num = tec.nextInt();
		escreveMensagem(num);
		dizOla();
	
	}



	
	public static void escreveMensagem (int tipoMsg) {
		switch (tipoMsg) {
		case 1:
			System.out.println ("O metodo escreve msg tipo 1");
			break;
		case 2:
			System.out.println ("O metodo escreve msg tipo 2");
			break;
		case 3:
			System.out.println ("O metodo escreve msg tipo 3");
			break;
		case 4:
			System.out.println ("O metodo escreve msg tipo 4");
			break;
		case 5:
			System.out.println ("O metodo escreve msg tipo 5");
			break;
		case 7:
			System.out.println ("O metodo escreve msg tipo 6");
			break;
		default:
			System.out.println ("Numero nao existente");
			break;
		
		}
	
	
	}
	
	
	public static void dizOla() {
	System.out.println(" OLA, ESTE METODO NAO SERVE PARA NADA");
	
	
	
	}
	
}