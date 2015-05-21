import java.util.Scanner;
public class ValProd {
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
			
		double vp = 0; 
		double vpj = vp; 
		int np = 0; 
		double cp = 0; 
		
		System.out.println("Informe o Valor do Produto");
		vp = tec.nextDouble();
		System.out.println("Informe o Numero de Parcelas");
		np = tec.nextInt();
		
		if (np < 4){
			vpj = vp;
		}else{
			if (np>3 && np<8 ){
				vpj = vp * 0.1 + vp;
			}else{
				vpj = vp * 0.2 + vp;
			}
		}
	
	
		if (np > 10) {
			System.out.println("Numero maximo de parcelas eh 10");
		}else{
			cp = vpj/np; 
			System.out.println("Valor a vista do produto eh " + vp);
			System.out.println("Valor parcelado do produto eh " + vpj);
			System.out.println("O Valor de cada parcela eh " + cp);
		}
	}
}