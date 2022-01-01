public class constantV{
	static void switchExample(){
			System.out.println("\n Inside switchExample.....");
			final byte month2=2;
			
			byte month=3;
			switch(month){
				case 1: System.out.println("January");
						break;
				case month2: System.out.println("February");
							 break;
				case 3:System.out.println("March");
						break;
				default: System.out.println("April");
			}
		}
	public static void main(String[] args){
		switchExample();
	}
 }