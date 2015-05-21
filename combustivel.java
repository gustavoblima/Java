public class combustivel{
	public static void main(String args []) {
	int dist, tanq, horas, soma, div, mult, quociente;
	
	horas = 2;
	dist = 95;
	tanq = 25;
		
	//Calculo de Consumo;
		//Esta opcao faz a multiplicacao;
		mult = horas * dist;
		System.out.println("");
		System.out.println("A Distancia percorrida sera: ");
		System.out.println(dist + "*" + horas + "-->" + mult);
		
		quociente = mult / tanq;
		System.out.println("");
		System.out.println("Variavies que podem sofrer atribuicao");
		System.out.println("O Consumo por KM de Combustivel sera: -->" + quociente);
		
		if (quociente > 8) {
		System.out.println("O Carro e economico");
		}
		else {
		System.out.println("O Carro chupa no Algodao");
		}
	
	
	
	} 

}