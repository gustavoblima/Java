import java.util.Scanner;

public class Testabairro {
	public static void main (String[] args) {
	int bairro;
	Scanner entrada = new Scanner( System.in);
	System.out.println("Insira o bairro: ");
	bairro = entrada.nextInt();
	System.out.println("numero do bairro fornecido eh: " + bairro );
	
	switch (bairro) {
		case 1:
		System.out.println ("O bairro eh Vieiralves. Leve flores");
		break;
		case 2:
		System.out.println ("O barrio eh o centro. Leve Colete");
		break;
		case 3:
		System.out.println ("O barrio eh o SAO RAIMUNDO. LEVE PORRETE");
		break;
		case 4:
		System.out.println ("O barrio eh A GLORIA. LEVE TERCADO");
		break;
		case 5:
		System.out.println ("O barrio eh o NOVO ISRAEL. LEVE PISTOLA");
		break;
		case 6:
		System.out.println ("O barrio eh A COMPENSA LEVE METRALHADORA");
		break;
		default:

	
	
	}
	
	
	}
}