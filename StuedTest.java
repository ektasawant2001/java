public class StuedTest{
	public static void main(String[] args){
		student Student1=new student(1000,"joan","male",18,223_456_7890L,3.8,'B');
		student Student2=new student(1001,"Raj","male",21,223_456_9999L,3.4,'M',true);
		student Student3=new student(1002,"Ankita","male",20,223_456_8888L,4.0,'M',true);
		Student3.setGender("fmale");
		
		System.out.println("\nStudent.computecount:"+student.computecount);
		System.out.println("\nName of Student1: "+Student1.getName());
		System.out.println("\nName of Student2: "+Student2.getName());
		System.out.println("\nName of Student3: "+Student3.getName());
		
		Student1.updateProfile("Jhon");
		System.out.println("Updated name of Student1: "+Student1.getName());
	
	}
}