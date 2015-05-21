import java.util.Scanner;

public class MuitasCoisas {
	public static void main(String[] args){
		int opcaoEscolhida = 0;
		double primeiroNumero = 0;
		double segundoNumero = 0;
		
		Scanner gluglu = new Scanner(System.in);
		
		System.out.println("O que voce deseja fazer?");
		System.out.println("	1 - Somar");
		System.out.println("	2 - Subtrair");
		System.out.println("	3 - Multiplicar");
		System.out.println("	4 - Dividir");
		System.out.println("	5 - Sequencia de Numeros");
		System.out.println("	6 - Faz comparacao");
		System.out.println("	7 - Calcula Idade");
		System.out.println("	8 - Contrata ou nao Contrata");
		
		opcaoEscolhida = gluglu.nextInt();
		
		if ((opcaoEscolhida> 0) && (opcaoEscolhida<8)){
			System.out.println("Insira o primeiro numero");
			primeiroNumero = gluglu.nextDouble();
			
			System.out.println("Insira o segundo numero");
			segundoNumero = gluglu.nextDouble();
		}

		switch (opcaoEscolhida){
			case 1:
				System.out.println("Voce escolheu Somar");
				fazSoma(primeiroNumero,segundoNumero);
				break;
			case 2:
				System.out.println("Voce escolheu Subtrair");
				fazSubtracao(primeiroNumero,segundoNumero);
				break;
			case 3:
				System.out.println("Voce escolheu Multiplicar");
				fazMultiplicacao(primeiroNumero,segundoNumero);
				break;
			case 4:
				System.out.println("Voce escolheu Dividir");
				fazDivisao(primeiroNumero,segundoNumero);
				break;
			case 5:
				System.out.println("Voce escolheu Sequencia");
				fazSequencia(primeiroNumero,segundoNumero);
				break;
			case 6:
				System.out.println("Voce escolheu comparacao");
				if (fazComparacao(primeiroNumero,segundoNumero) == true){
					System.out.println("O primeiro numero eh maior que o segundo");
				}else{
					System.out.println("O primeiro numero NAO eh maior que o segundo");
				}
				break;	
			case 7:
				System.out.println("Voce escolheu Idade");
				System.out.println("A idade eh " + 
				retornaAnos(primeiroNumero,segundoNumero)); 
				break;
			case 8:
				if (contrataNaoContrata() == true){
					System.out.println("O candidato pode ser contratado"); 
				}else{
					System.out.println("O candidato NAO pode ser contratado");
				}
				break;	
			default:
				System.out.println("Opcao invalida");
				break;
		}
	}
	
	static void fazSoma(double num1, double num2){
		System.out.println("o resultado da soma eh " + (num1 + num2));
	}
	
	static void fazSubtracao(double num1, double num2){
		System.out.println("o resultado da subtracao de " + num1 + 
		" por " + num2 + " eh " + ( num1 - num2));
	}
	
	static void fazMultiplicacao(double num1, double num2){
		System.out.println("o resultado da multiplicacao de " + num1 + 
		" por " + num2 + " eh " + ( num1 * num2));
	}

	static void fazDivisao(double num1, double num2){
		System.out.println("o resultado da divisao de " + num1 + 
		" por " + num2 + " eh " + ( num1 / num2));
	}

	static void fazSequencia(double num1, double num2){
		System.out.println("A sequencia entre " + num1 + 
		" e " + num2 + " eh a seguinte: ");
		
		for (double x = num1; x <= num2; x++){
		System.out.println(x); 
		} 
	}

	static boolean fazComparacao(double num1, double num2){
		if (num1 > num2){
				return true;
			}else{
				return false;
			}
	}

	static double retornaAnos(double num1, double num2){
			if (num1 < num2){
				System.out.println("O primeiro numero tem que ser maior que o segundo"); 
				return 0;
			}else{
				return num1 - num2;
			}
			
	}	

	static boolean contrataNaoContrata(){
		
		Scanner pegaTela = new Scanner(System.in);

		boolean inteligente; 
		boolean trabalhador;
		boolean assiduo;
		boolean pontual;
		boolean criativo;
		int totalAcertos = 0;
		
		System.out.println("candidato eh inteligente? ");
		inteligente = pegaTela.nextBoolean();

		System.out.println("candidato eh trabalhador? ");
		trabalhador = pegaTela.nextBoolean();

		System.out.println("candidato eh assiduo? ");
		assiduo = pegaTela.nextBoolean();	

		System.out.println("candidato eh pontual ? ");
		pontual = pegaTela.nextBoolean();	

		System.out.println("candidato eh criativo? ");
		criativo = pegaTela.nextBoolean();	

		
		if (inteligente) totalAcertos ++;
		if (trabalhador) totalAcertos ++;
		if (assiduo) totalAcertos ++;
		if (pontual) totalAcertos ++;
		if (criativo) totalAcertos ++;
		
		if (totalAcertos > 2) {
			return true;	
		}else{
			return false;	
		}
		
	}	
}	
	