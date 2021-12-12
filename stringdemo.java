class stringdemo{
	static void stringExample(){
		System.out.println("\nInside string.......");
		String s="Hello World!";
		System.out.println("S: "+s);
		
		System.out.println("\nS.length(): "+s.length());
		System.out.println("S.isEmpty(): "+s.isEmpty());
		
		//comparison
		System.out.println("\nS.equals(\"HELLO WORLD!\"): "+s.equals("HELLO WORLD!"));
		System.out.println("\nS.equalsIgnoreCase(\"HELLO WORLD!\"): "+s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println("\nS.compareTo(\"HELLO WORLD!\"): "+s.compareTo("HELLO WORLD!"));
		
		//searching
		System.out.println("\nS.contains(\"HELLO WORLD!\"): "+s.contains("HELLO WORLD!"));
		System.out.println("\nS.contains(\"WORLD!\"): "+s.contains("WORLD!"));
		System.out.println("\nS.startsWith(\"HELLO WORLD!\"): "+s.startsWith("HELLO WORLD!"));
		System.out.println("\nS.startsWith(\"hello world!\"): "+s.startsWith("hello world!"));
		System.out.println("\nS.endsWith(\"!\"): "+s.endsWith("!"));
		System.out.println("\nS.indexOf(\"lo\"): "+s.indexOf("lo"));
		System.out.println("\nS.indexOf(\"o\"): "+s.indexOf("o"));
		System.out.println("\nS.lastIndexOf(\"o\"): "+s.lastIndexOf("o"));
		
		//Examining individual characters
		System.out.println("\nS.charAt(4): "+s.charAt(4));
		
		//Extracting Substrings
		System.out.println("\ns.substring(4): "+s.substring(4));
		System.out.println("\ns.substring(4,9): "+s.substring(4,9));
		
		//case translation 
		System.out.println("\ns.toUpperCase(): "+s.toUpperCase());
		System.out.println("\ns.toLowerCase(): "+s.toLowerCase());
		
		System.out.println("\ns.trim(): "+s.trim());
		
		//Replace
		System.out.println("\ns.replaceAll(\"o\",\"r\"): "+s.replaceAll("o","r"));
		
		//split
		System.out.println("\ns.split(\"o\"): ");
		String[] sa=s.split("o");
		for(String temp:sa){
			System.out.println(temp);
		}
		//static method (include overloaded methods)
		System.out.println("\nString.valueOf(1.3): "+String.valueOf(1.3));
		
	}

	public static void main(String[] args){
		stringExample();
	}

}