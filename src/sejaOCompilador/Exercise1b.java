class Excercise1b {
	public static void main (String[] args ){
		int x = 1;
		while (x < 10 )
		{
			if( x > 3 ) 
			{
				System.out.println("Big x");
			}
		x++;//Adicionado 	
		//O erro desse trecho era que não tinha uma condião de parada no while	
		}//Fim do while e do primeiro código

		x = 5;
		while(x > 1)
		{
			x--;
			if(x < 3)
			{
				System.out.println("Small x");
			}
		//Essa parte do código não iria gerar problemas	
		}//Fim fo while e do segundo código
		//Nó livro, esse trecho não iria rodar por que estava sem o método main
		x = 5;
		while( x > 1)
		{
			x--;
			if(x < 3 )
			{
				System.out.println("Small x");
			}
		}//Fim do laço while e do terciero código
	}
}
