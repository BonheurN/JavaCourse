
public class overloadmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = add(12,13);
		double q = add(44.0, 55.0);
		System.out.println(q);
	

	}
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a+b;
	}
	static int add(int a, int b, int c){
		System.out.println("This is overloaded method #2");
		return a+b+c;
	}
	static int add(int a, int b, int c, int d  ) {
		System.out.println("This is overloaded methhod #3");
		return a+b+c+d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a+b;
	}
	static double add(double a, double b, double c ) {
		System.out.println("This is overloaded method #5");
		return a+b+c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a+b+c+d;
	}
	
}
