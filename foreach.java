class foreach{
	public static void main(String[] args){
	
	int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	iArray = new int[]{1,2,3,4,5,6,7,8,9};
	
	for(int i :  iArray){
		System.out.println(i+ " ");
	}
	System.out.println("\n\nPrinting rolls of dice....\n");
	int[] dice1={1,2,3,4,5,6};
	int[] dice2={1,2,3,4,5,6};
	for(int i: dice1){
		for(int j: dice2){
			System.out.println(i+" "+j);
		}
	}
	for(int i=0,j=0;i<dice1.length && j<dice2.length; i++,j++){
		System.out.println(dice1[i] +" "+dice2[j]);
	}
		
	
	}
}