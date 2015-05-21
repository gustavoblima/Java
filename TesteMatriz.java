public class TesteMatriz {
	public static void main(String[] args){
	
		double [] arrayTeste  = new double[5];
		System.out.println("primeiro faco as atribuicoes" ); 
		System.out.println("" ); 
		arrayTeste[0] = 10.5;
		arrayTeste[1] = 20.4;
		arrayTeste[2] = 10560.332;
		arrayTeste[3] = 212.301;
		arrayTeste[4] = 1.1;
		System.out.println("" ); 		
		System.out.println("agora exibo os valores" ); 
		System.out.println("" ); 
		
		for (int x = 0; x <=4; x++){
			System.out.println("o valor da posicao " + x + 
			" do meu array eh " +  arrayTeste[x]);
		}
		
	
	}
}