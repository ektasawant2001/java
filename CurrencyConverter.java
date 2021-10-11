 class CurrencyConverter{
	void printCurrencies() {
        int rupee = 75;
	int dirham = 4; // UAE
  	int real = 5;  // brazilian     
	int chilean_peso = 824;
	int mexican_peso = 20;       
	int _yen = 113;
	int $australian = 2;  // australian dollar
	int dollar=1;
	int Rupee = 75;
        System.out.println("rupee: " + rupee); 
        System.out.println("Dirham: " + dirham);  
 	System.out.println("Real: " + real); 
 	System.out.println("Chilliean_peso: " + chilean_peso); 
 	System.out.println("Mexican_peso: " + mexican_peso); 
 	System.out.println("Yen: " +  _yen);   
	System.out.println("$australian: " + $australian);
	System.out.println("Dollar: " + dollar); 
 	System.out.println("Rupee: " + Rupee);
	}
	
	public static void main(String[] args){
        CurrencyConverter cc = new CurrencyConverter();
	cc.printCurrencies(); 
	}
}
