public class BeerSong {

	public static void main (String[] args ){
	
		int beerNum = 99;
		String word = "Bottles";

		while(beerNum > 0){
			if(beerNum == 1){
				word = "bottle";
			}
			System.out.println(beerNum + " " + word + " of beer on the well ");
			System.out.println(beerNum + " " + word + " of beer ");
			System.out.println("Take one down. ");
			System.out.println("Pass it around.");
			beerNum --;

			if(beerNum == 0) {
				System.out.println("No more botlles off beer on the wall ");
			} 
		}//fim do loop while
	}//fim do método main 
}//fim da classe
