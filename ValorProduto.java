import java.util.Scanner; 

public class ValorProduto{
	public static void main(String args[]){
	double valor, div, jr1, jr2,jr10, jr20, soma1, soma2, soma3, soma4;
	int parcelas;
	
	Scanner entrada = new Scanner(System.in);
	System.out.println(" digite valor do produto");
	System.out.println("");
	valor = entrada.nextDouble();
	
	System.out.println(" valor da parcela");
	System.out.println("");
	parcelas = entrada.nextInt();
	jr1 = 0.1;
	jr2 = 0.2;
	jr10 = (jr1 * valor / parcelas)*parcelas;
	jr20 = (jr2 * valor / parcelas)*parcelas;
	soma1 = jr10 + valor;
	soma2 = jr20 + valor;
	div = valor / parcelas;
	soma3 = (valor / parcelas) + soma2;
	soma4 = (valor / parcelas) + soma1;
	
	if ( parcelas > 1 && parcelas < 3 ){
	System.out.println("sem juros");}
	
	if ( parcelas > 4 && parcelas < 7){
	System.out.println("10% de juros valor total do produto com juros " + soma1+ "\n Entao o valor das parcelas sera: " + soma3/parcelas  );}
	System.out.println("");
	
	if ( parcelas > 8 && parcelas <= 10){
    System.out.println("20% de juros valor toatl do produto com juros " + soma2 + "\n Entao o valor das parcelas sera: " + soma4/parcelas );}
	System.out.println("");
	
	
	if (parcelas > 10 ) {
	
	System.out.println (" nao eh possivel parcelar");}
	else {System.out.println("o valor das parcelas em " + parcelas + " vezes ");}
	
	
	 
	 
	}
}