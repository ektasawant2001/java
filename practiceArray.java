public class practiceArray{
	static void arrays(){
		System.out.println("\n----------------------------------------");
		System.out.println("Inside arrays.......");
		// int scores[]=new int[4];
		/*int[] scores=new int[4];
		scores[0]=90;
		scores[1]=80;
		scores[2]=70;
		scores[3]=60;*/
		//int[] scores=new int[] {90,88,776,34};
		int[] scores={90,88,776,34};
		System.out.println("Mid-term 1: "+scores[0]);
		System.out.println("Mid-term 2: "+scores[1]);
		System.out.println("Final: "+scores[2]);
		System.out.println("Project: "+scores[3]);
		System.out.println("# Exams: "+scores.length);
		System.out.println("\n----------------------------------------");
		
		/*student[] students=new student[3];
		students[0]=new student();
		students[1]=new student();
		students[2]=new student();*/
		//student[] students=new student[]{new student(),new student(),new student()};
		student[] students={new student(),new student(),new student()};
		students[0].name="ekta";
		students[1].name="pragati";
		students[2].name="bhagyashree";
		
		System.out.println("\n----------------------------------------");
		System.out.println("Student 1: "+students[0]);
		System.out.println("Student 2: "+students[1]);
		System.out.println("Student 3: "+students[2]);
		System.out.println("\n----------------------------------------");
		}
		
	public static void main(String[] args){
		arrays();
	}
}
		
		