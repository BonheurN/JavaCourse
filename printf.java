
public class printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean myboolean = true;
		int age = 22;
		String name = "Bruno";
		double weight = 78.23;
		char mychar = '@';
		final double pi = 3.14;
//		pi = 4;
		System.out.println(pi);
		
		System.out.printf("Your name is %s\n",name);
		System.out.printf("You are %d\n",age);
		System.out.printf("You weigh %.8f kgs\n",weight);
		System.out.printf("This character is used in gmail\n",mychar); 
		System.out.printf("His word is %b",myboolean);
		
	}

}
