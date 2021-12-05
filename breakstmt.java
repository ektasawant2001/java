class breakstmt{
	static void labeledBreak(){
			System.out.println("\nInside Labeled Break");
			int num=0;
			
			outermost: for(int i = 0; i <= 10; i++){
				for(int j = 0; j <= 10; j++){
					if(i == 5 && j == 5){
						break outermost;
					}
					num++;
				}
			}
			System.out.println("num: "+num);
		}
	
	
	public static void main(String[] args){
		labeledBreak();
	}
}