public class UserTest{
	public void printUserType(User u){
		u.printUserType();
	}
	
	public static void main(String[] args){
		//part1
		User user = new User();
		User Staff = new Staff();
		User editor = new Editor();
		
		UserTest ut = new UserTest();
		/*ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);
		*/
		
		//part 2
		 //editor.approveReview();
		editor.postAReview();
		editor.saveWebLink();
	}
}