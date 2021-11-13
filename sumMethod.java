public class sumMethod{
	static double sum(double x,double y){
		return x+y;
	}
	static double avg(double x,double y){
		double sum=sum(x,y);
		return (sum/2);
	}
	public static void main(String[] args){
		double d=sum(44.7,7.9);
		System.out.println(d);
		double d2=avg(44.7,7.9);
		System.out.println(d2);
	}
}