public class BoxedPrimitives{
	/*public static Integer valueOf(int i){
		if (i >= IntegerCache.low && i <= IntegerCache.high)
			return IntegerCache.cache[i+(-IntegerCache.low)];
		return new Integer(i);
	}*/
	
	private static void boxedprimitives(){
		Integer boxedInt = Integer.valueOf(8); //static factory
		Boolean boxedBoolean = Boolean.valueOf(true); 
		Character boxedCharacter = Character.valueOf('c'); 
		Double boxedDouble = Double.valueOf(25.5); 
		
		System.out.println(boxedInt);
		System.out.println(boxedBoolean);
		System.out.println(boxedCharacter);
		System.out.println(boxedDouble);
		
		Integer boxedInt1=Integer.valueOf("8");
		
		//unwrap: typeValue
		int primitiveInt = boxedInt.intValue();
		boolean primitiveBoxed = boxedBoolean.booleanValue();
		char primitiveChar = boxedCharacter.charValue();
		System.out.println(primitiveInt);
	}
	
	public static void main(String[] args){
		boxedprimitives();
	}
}