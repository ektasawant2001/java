public class student{
	static int computecount;
	
	private String name,gender;
	private int id;
	private long phone;
	private char degree;
	private double gpa;
	private int age;
	private boolean international;
	private double internationalFees=12000.0;
	private double tuitionFees=70000.0;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		if(gender.equals("male")||gender.equals("female")||gender.equals("transgender")){
		this.gender=gender;
		}else{
			throw new IllegalArgumentException("Invalid gender!!");
		}
	}
	
	public student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa,
			char newDegree) {
		this(newId, newName, newGender, newAge, newPhone, newGpa, newDegree, false);
	}

	
	public student(int id, String name, String gender, int age, long phone, double gpa, char degree,
			boolean international) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.gpa = gpa;
		this.degree = degree;
		this.international = international;

		computecount=computecount+1;
		int nextId = id + 1;

		if (international) {
			tuitionFees = tuitionFees + internationalFees;
			// return;
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
		System.out.println("studentCount: " + computecount);
	}
	public student(){
		
	}
	public boolean updateProfile(String name){
		this.name=name;
		return true;
	}
	
}
		



		
		