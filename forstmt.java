class forstmt {
	public static void main(String[] args){
	int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	  for (int i = iArray.length-1; i >= 0; i--) { 
		System.out.print(iArray[i] + " ");		
	  }  
	  System.out.println("\n\nReversing Array ... ");
	  for (int i = 0, j = iArray.length-1, middle = iArray.length >>> 1; i < middle; i++, j--) {
		int temp = iArray[i];
		iArray[i] = iArray[j];
		iArray[j] = temp;
	  }	  
	  
	  for (int i = 0; i < iArray.length; i++) { 
		System.out.print(iArray[i] + " ");
	  }
	  
	  System.out.println("\n\nCounting divisors ...");
	  int x = 24;
	  int count = 0;
	  for (int i = 1; i <= x; i++) {
		if (x % i == 0) {
		  System.out.print(i + " ");
		  count++;
		}
	  }
	  System.out.println("\nDivisor Count: " + count);
	  
	  System.out.println("\nDisplaying Student Grades ...");
	  int[][] studentGrades = {{76, 52, 69, 83, 45, 90}, {22, 71, 67, 69, 40}, {53, 87, 91, 25}};
	  for (int i = 0; i < studentGrades.length; i++) {
	    System.out.print("\nDisplaying grades of students from class " + i + ": ");
		int max = 0;
		for (int j = 0; j < studentGrades[i].length; j++) {
		    if (studentGrades[i][j] > max) {
			    max = studentGrades[i][j];
			}
			System.out.print(studentGrades[i][j] + " ");
		}
		System.out.println("\nmax: " + max);

}

}
}
