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
		User Staff = new Staff();
		User editor = new Editor();
		
		//UserTest ut = new UserTest();
		/*ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);
		*/
		
		//part 2
		 //editor.approveReview();
		editor.postAReview();
		editor.saveWebLink();
		
		// casting &  instanceof demo
		UserTest ut = new UserTest();
		//ut.approveReview(new Staff());
		ut.approveReview(new Editor());
	}
}