public class UserTest{
	public void printUserType(User u){
		u.printUserType();
	}
	public void approveReview(Staff s){
		if(s instanceof Editor){
			((Editor) s).approveReview();
		}else{
			System.out.println("Invalid Object Passed !!");
		}
	}
	
	public static void main(String[] args){
		//part1
		User user = new User();
		//User staff = new Staff();
		User editor = new Editor();
		//staff.postAReview("");
		//((Staff)staff).printId();
		
		//UserTest ut = new UserTest();
		/*ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);
		
		
		//part 2
		 //editor.approveReview();
		editor.postAReview();
		editor.saveWebLink();
		
		// casting &  instanceof demo
		UserTest ut = new UserTest();
		//ut.approveReview(new Staff());
		ut.approveReview(new Editor());
		*/
		//method binding demo
		//User staff = new Staff();
		//staff.staticMethod(); // part1
		//staff.postAReview(" ");
		//staff.instanceMethod(10);//part2
		//staff.instanceMethod(new Staff());
		
		/*//what is not overrriden
		User staff = new Editor();
		staff.staticMethod(); //early binding
		((Staff) staff).staticMethod();
		staff.saveWebLink();
		*/
		//overriding of instance variables demo
		//User staff = new Staff();
		//System.out.println("User type: "+ staff.userType); //early binding
		//staff.displayUserInfo(); //comparison of field hiding and fieloverriding
		//System.out.println(staff.toString());
		
		/*System.out.println(staff.hashCode());
		User staff2 = staff;
		System.out.println(staff2.hashCode());
		*/
		User staff = new Staff(3);
	}
}