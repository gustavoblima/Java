public class Consumo {
	public static void main(String args[]) {
		double tanqueCheio, meioTanque, tempo; 
		double kmPorHora, distanciaTotal, consumoTotal;
		double kmPorLitro;
		
		//Atribuicoes
		tanqueCheio = 50;
		meioTanque = tanqueCheio / 2;
		tempo = 2;
		kmPorHora = 95;
		distanciaTotal = tempo * kmPorHora;
		consumoTotal  = meioTanque;
		kmPorLitro = distanciaTotal/consumoTotal;

		//exibicao
		System.out.println("O tanque do carro cheio he: " + tanqueCheio);
		System.out.println("Metade do tanque eh: " + meioTanque);
		System.out.println("O tempo gasto total eh: " + tempo);
		System.out.println("rodando " + tempo + " horas a " + kmPorHora + " km por hora o carro rodou " + distanciaTotal );
		System.out.println("Se o carro rodou " + distanciaTotal + " km e gastou " + consumoTotal + " entao o consumo dele eh " + kmPorLitro );
		
		
		
	}
}