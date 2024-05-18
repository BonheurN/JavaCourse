import java.util.ArrayList;
import java.util.Scanner;
public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
//	 Wrapper class = provides a way to use premitive data types asreference data type
//		reference data type contain some useful methods 
//		can be used with collection(ex.ArrayList)
//		
//		Primitive                            Wrapper calss
//		--------                             -------------
//      boolean                              Boolean
//		char                                 Characters
//		int                                  Integer
//		double                               Double
//		Autoboxing = the automatic conversion that the java compiler makes between primitive data type and their corresponding  object wrapper class 
//		unboxing the reverse of autoboxing . Automatic conversion of wrapper class to primitive 
//		
//		
//		Boolean a = true;
//		Character b = '@';
//		Integer c = 123;
//		Double d = 3.14;
//		String name = "Ndamukunda";
//		if(name =="") {
//			System.out.println("This is true");
//		}
//		else {
//			System.out.println("Enter a name ");
//			name = scanner.nextLine();
//			System.out.println("Hello "+name);
//		}
//		ArraList = Resizeable array
//		Elements can be added and removed after compilation phase
//		Store reference data type 
//		}
//
//		ArrayList<String> food = new ArrayList<>();
//		food.add("pizza");
//		food.add("wrap");
//		food.add("samosa");
//		food.add("roleggs");
//	for(int i = 0; i<food.size(); i++) {
//		System.out.println(food.get(i));
//	}
		ArrayList<String> bakkerylist = new ArrayList<> ();
		bakkerylist.add("cake");
		bakkerylist.add("bread");
		bakkerylist.add("donut");
		ArrayList<String>produce = new ArrayList<>();
		produce.add("noodles");
		produce.add("imvange");
		produce.add("pirawu");
		ArrayList<String>drinks = new ArrayList<>();
		drinks.add("soda");
		drinks.add("beer");
		drinks.add("water");
		
		ArrayList<ArrayList<String>>Grocerylist = new ArrayList<>();
		Grocerylist.add(bakkerylist);
		Grocerylist.add(produce);
		Grocerylist.add(drinks);	
		System.out.println(Grocerylist.get(1).get(0));
		
		
		
	}

}
