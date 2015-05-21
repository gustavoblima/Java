public class DeclaracaoVariaveis {
	public static void main(String args[]) {
		int x, y, soma, mult;
		double z;
		double valorReal;
		double resto;
		double quociente;
		char letra;
		String sequenciaLetras;
		boolean variavelLogica;
		final int numeroConstante1 = 10;
		final String stringConstante = "Maria";
		// variaveis novas
		boolean marido;
		boolean bonito;
		boolean rico; 
		boolean educado; 
		// variaveis novas 
		
		// atribuicoes novas
	  
		bonito = true;
		rico = true;
		educado = false;
		
		
		x = 10;
		y = 20;
		z = 30;

	
	
		//este pedaco e novo
		marido = rico ^ bonito;
		System.out.println("");
		System.out.println("agora testamos se o cara presta para marido");
		System.out.println(" a condicao de marido eh: " + marido);
		//
		resto = x % y;
		System.out.println("");
		System.out.println("agora testamos o resto da divisao");
		System.out.println("resto da divisao de " + x + "por" + y + "eh" + resto);
		
		quociente = z / y;
		System.out.println("");
		System.out.println("agora testamos a divisao");
		System.out.println("a divisao de " + z + "por" + y + "eh" + quociente);
		
		soma = x + y;
		System.out.println("");
		System.out.println("Variavies que podem sofrer atribuicao");
		System.out.println(x + "+" + y + "-->" + soma);
		
		


		valorReal = 1500.45;
		System.out.println("Valor real:" + valorReal);

		letra = 1;
		System.out.println("Letra:" + letra);
		
		sequenciaLetras = " Globalcode" ;
		System.out.println("String:" + sequenciaLetras);
		
		variavelLogica = true;
		System.out.println("Valor booleano:" + variavelLogica);

		System.out.println("");
		System.out.println("Variavies cujo valor não pode ser alterado (constantes)");
		System.out.println("Numero constante:" + numeroConstante1);
		System.out.println("Texto constante:" + stringConstante );
	}
}