/**
* @author Client Inc.
*/
import java.util.*;
public class TestClient{
	public static int getVal(){
		return 42;
	}
	
	public static void main(String[] args){
		/*A a= new X();
		a.foo();
		a.bar();*/
	//Interface demo
		C c = new X();
		/*c.foo();
		c.bar();
		c.foobar();*/
		
		//Clone demo
		/*C clone = ((X) c).clone();
		if(clone != c){
			System.out.println("Clone Created !!");
		}*/
		
		//default method demo
		//c.go();
		//c.staticMethod();//error
		C.staticMethod();
		//((X)c).inheritanceTest();
		
		new TestClient().lambdaTest( () -> System.out.println("Java In Depth"));
		
	}
	void lambdaTest(FunctionalInterface fi){
		fi.test();
	}
}