class StudThisReference {
      static int studentCount;  
      int id;
	  String name;
	  String gender;
	  int age;
	  long phone;	  
	  double gpa;	  
	  char degree;
	  boolean international;
	  double tuitionFees = 12000.0;
	  double internationalFees = 5000.0;
	  StudThisReference(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree) {
		  this(newId, newName, newGender, newAge,newPhone,newGpa,newDegree,false);
	  }
	  StudThisReference(int id, String name, String gender, int age, long phone, double gpa, char degree, boolean international) {
		  this.id = id;
		  this.name = name;
		  this.gender = gender;
		  this.age = age;
		  this.phone = phone;
		  this.gpa = gpa;
		  this.degree = degree;
		  this.international = international;
		  studentCount = studentCount + 1;
		  int nextId = id + 1;		  
		  if (international) {
		      tuitionFees = tuitionFees + internationalFees;
			  //return;
		  }	
	      System.out.println("\nid: " + this.id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("name: " + this.name);
		  System.out.println("gender: " + this.gender);
		  System.out.println("age: " + this.age);
		  System.out.println("phone: " + this.phone);
		  System.out.println("gpa: " + this.gpa);
		  System.out.println("degree: " + this.degree);
		  System.out.println("tuitionFees: " + tuitionFees);
		  System.out.println("studentCount: " + studentCount);
	  }
	  
	 StudThisReference() {}
	 boolean updateProfile(String name){
		 this.name=name;
		 return true;
	 }
	  public static void main(String[] args) {
	      StudThisReference student1 = new StudThisReference(1000, "John", "male", 18, 223_456_7890L, 3.8, 'B'); 
		  StudThisReference student2 = new StudThisReference(1001, "Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);
		  StudThisReference student3 = new StudThisReference(1002, "Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);
		  System.out.println("\nStudent.studentCount: " + StudThisReference.studentCount);
		  System.out.println("\nName of Student1: " + student1.name);
		  System.out.println("\nName of Student2: " + student2.name);
		  System.out.println("\nName of Student3: " + student3.name);
	  }
  }