import java.util.Scanner;

public class TestaSocio {
	public static void main (String[] args) {
	int renda;
	boolean olhosAzuis;
	boolean brega;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Insira a renda do candidato a socio ");
	renda = entrada.nextInt();
	System.out.println("A renda informada e: " + renda);

	
	
		
	System.out.println("A renda informada e: " + renda);
	
	if(renda < 2000) {
		
	System.out.println("O cara tem olhos azuis? - Insira true ou false ");
	olhosAzuis = entrada.nextBoolean();
		if (olhosAzuis == true) {
	System.out.println ( "Voce informou que o cara tem Olhos Azuis!");
	} 
	else {
		System.out.println("Voce informou que o cara NAO tem olhos Azuis!");
	}
		if (olhosAzuis == true) {
		
		System.out.println("Eh liso mas o cara tem olhos azuis, Eh LATINHAAA!");
		
		}
		else {
		
		System.out.println("Eh liso e o cara nao tem olhos azuis, FICA FORRA DESSA PARADA!");
		}
		
	
	}
	
	if((renda > 20000)) {
		if (brega = true) {
		
		System.out.println("o CARA eh BREGA ENTAO TA FORA! ");
		
		}
		else {
		
		System.out.println("O CARA TA DENTRO DA PARADA, EH DIAMANETE");
		}
		
	
	}
	
	
	if(renda > 2000 && renda < 5000) {
	System.out.println("Este socio eh latinha");
	}
	
	if(renda > 5000 && renda < 10000) {
	System.out.println("Este socio eh Cliente PRATA");
	}
	
	if(renda > 10000 && renda < 20000) {
	System.out.println("Este socio eh Cliente OUROOO!");
	}
	
	if(renda > 20000) {
		 System.out.println("O cara Eh brega? - Insira true ou false ");
	olhosAzuis = entrada.nextBoolean();
	
	
			if (brega = true) {
		
			System.out.println("o CARA eh BREGA ENTAO TA FORA! ");
		
			}
			else {
		
			System.out.println("O CARA TA DENTRO DA PARADA, EH DIAMANETE");
			}
		
	}
		
	

	
	
	}
}