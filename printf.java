
public class printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //printf() = an optional method to control, format and display text to the console window t
		          // two argument = format string + (object / variable / value )
		          // [flags] [precision] [width] [version-character]
		boolean myboolean = true;
		char mychar = '@';
		String mystring = "Bonheur";
		int myint = 125;
		double mydouble = 1280;

//      [conversion character]
		
//		System.out.printf(" %s\n",mystring);
//		System.out.printf(" %f\n",mydouble);
//		System.out.printf(" %d\n",myint);
//		System.out.printf(" %b\n",myboolean);
//		System.out.printf(" %c\n",mychar);
		
		
//      [width]
//		minimum character to be written as output 
//		System.out.printf("hello %-10s",mystring);
	
//      [precision]
//      sets number of digit of precision when outputting floating-values 
//	    System.out.printf("This is amount of money you have on your acc %.3f",mydouble);

//		[flags]
		/*
		 * adds an effect to output based on the flag added to format specifier 
		 * - :left-justify
		 * + :output a plus (+) or minus (-) sign for a numeric value 
		 * 0 :numeric values are zero padded
		 * , :comma grouping separator if numbers > 1000
		 */
		
		System.out.printf("This is amount of money you have on your acc %,f",mydouble);
	}
}
