public class currencyConMethod {

	double[] exchangeRates;
	
	void setExchangeRates(double[] rates){
		exchangeRates = rates;
	}
	
	void updateExchangeRate(int arrayIndex, double newVal){
		exchangeRates[arrayIndex]=newVal;
	}
	
	double getExchangeRate(int arrayIndex){
		return exchangeRates[arrayIndex];
	}
	
	double computeTransferAmount(int arrayIndex,double amount){
		return amount * getExchangeRate(arrayIndex);
	}
	
	void printCurrencies() {

		System.out.println("rupee: " + exchangeRates[0]);

		System.out.println("dirham: " +exchangeRates[1]);

		System.out.println("real: " + exchangeRates[2]);

		System.out.println("chilean_peso: " + exchangeRates[3]);

		System.out.println("mexican_peso: " + exchangeRates[4]);

		System.out.println("_yen: " + exchangeRates[5]);

		System.out.println("$australian: " + exchangeRates[6]);

}

	public static void main(String[] args) {

		currencyConMethod cc = new currencyConMethod();
		
		double[] rates ={75.0, 3.98, 5,824.0, 20.0, 112.87,2.3};
		cc.setExchangeRates(rates);
		
		cc.printCurrencies();
		
		rates =new double[] {74.0, 4.08, 5,824.0, 21.0, 112.87,2.3};
		cc.setExchangeRates(rates);
		
		cc.printCurrencies();
		
		cc.updateExchangeRate(0,71.0);
		cc.printCurrencies();
		
		double amount=cc.computeTransferAmount(0,1000);
		System.out.println("\nTransferred amount: "+amount);
	}

}