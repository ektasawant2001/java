  class precedence {
	static void charTypePromotion() {
	  System.out.println("\nInside charTypePromotion ...");
	  char char1 = 50; // Will be assigned corresponding UTF16 value 2
	  System.out.println("char1: " + char1); 
	  System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used	  
	  System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints	
	  System.out.println("('a' + 'b'): " + ('a' +'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
    }
		
	public static void main(String[] args) {	
	  charTypePromotion();
    }       
  }