class studentTest{
	public static void main(String[] args) {
	      StudThisReference student1 = new StudThisReference(1000, "Joan", "male", 18, 223_456_7890L, 3.8, 'B'); 
		  StudThisReference student2 = new StudThisReference(1001, "Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);
		  StudThisReference student3 = new StudThisReference(1002, "Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);
		  System.out.println("-----------------------------------------------------");
		  System.out.println("\nStudent.studentCount: " + StudThisReference.studentCount);
		  System.out.println("\nName of Student1: " + student1.name);
		  System.out.println("\nName of Student2: " + student2.name);
		  System.out.println("\nName of Student3: " + student3.name);
		  
		  System.out.println("-----------------------------------------------------");
		  student1.updateProfile("Jhon");
		  System.out.println("Updated name of Student1: "+student1.name);
		  
		  System.out.println("-----------------------------------------------------");
		  StudThisReference student4=student1;
		  System.out.println("Name of Student4: "+student4.name);
		  
		  System.out.println("-----------------------------------------------------");
		  /*student4.updateProfile("Milky");
		  System.out.println("Updated name of Student1: "+student1.name);
		  
		  System.out.println("-----------------------------------------------------");
		  student4=student2;
		  System.out.println("Name of Student4: "+student4.name);
		  
		  System.out.println("-----------------------------------------------------");
		  student2=student1;
		  System.out.println("Name of Student4: "+student4.name);
		  System.out.println("Name of Student2: "+student2.name);
		  
		  student4=new StudThisReference();
		  student4.updateProfile("Alex");
		  System.out.println("-----------------------------------------------------");
		  System.out.println("Name of Student4: "+student4.name);
		  System.out.println("Name of Student2: "+student2.name);
		  System.out.println("Name of Student1: "+student1.name);
		  System.out.println("-----------------------------------------------------");
		  */
		  StudThisReference[] students={student1,student2,student3};
		  swap(students,0,1,2);
		  System.out.println("Name of Student1: "+students[0].name);
		  System.out.println("Name of Student2: "+students[1].name);
		  System.out.println("Name of Student3: "+students[2].name);
		  
	  }
	  static void swap(StudThisReference[] students,int firstIndex,int secondIndex, int thirdIndex){
		  StudThisReference temp=students[firstIndex];
		  students[firstIndex]=students[secondIndex];
		  students[secondIndex]=students[thirdIndex];
		  students[thirdIndex]=temp;
	  }
}