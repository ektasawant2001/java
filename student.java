public class student{
	static int computecount;
	String name,gender;
	int id;
	long phone;
	char degree;
	boolean international;
	double gpa;
	double internationalFees=12000.0;
	double tuitionFees=70000.0;

	void compute(){
	
		computecount=computecount+1;
		int nextId=id+1;
		if(international){
		   tuitionFees=tuitionFees+internationalFees;
		}
		System.out.println("\nid: "+id);
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phone);
		System.out.println("Degree: "+degree);
		System.out.println("Gender: "+gender);
		System.out.println("gpa: "+gpa);
		System.out.println("TuitionFees: "+tuitionFees);
		System.out.println("nextid: "+nextId);
	}
	public static void main(String[] args){
		student s1=new student();
		s1.id=11;
		s1.name="Seema";
		s1.phone=87967;
		s1.degree='c';
		s1.gender="female";
		s1.gpa=7.8;
		s1.international=true;
		s1.compute();
}
}
		



		
		