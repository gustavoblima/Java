public class BeerCount {
	public static void main (String [] args) {
	int beerNum = 99;
	String word = "Garrafas";
	
		while ( beerNum > 0) {
		
		if (beerNum == 1 ) {
		
			word = "Garrafa";
		}
	
		System.out.println(beerNum + "" + word + "of beer on the wall");
		System.out.println(beerNum + "" + word + "of beer");
		System.out.println("Tire uma Garrafa!");
		System.out.println("Pass it around");
		beerNum = beerNum - 1;
		
			if (beerNum > 0) {
				System.out.println(beerNum + "" + word + "of beer on the wall");
			
			} else {
			System.out.println("NAO HÁ MAIS GARRAFAS");
			
			}
			
		
		}
	
	}

}