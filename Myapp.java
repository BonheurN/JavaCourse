import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		String[] Cars = {"Porsche", "Tesla", "Bughatti","Royce rollis"};
//		Cars[1] = "Mustang";
//		System.out.println(Cars[1]);
		
//		String[] Cable = new String [5];
//		Cable[0] = "Massseratti";
//		Cable[1] = "BMW";
//		Cable[2] = "Benz E-class";
//		Cable[3] = "Mustang";
//		Cable[4] = "Lamborghini";
//		
//		for(int i=0; i<Cable.length; i++) {
//			System.out.println(Cable[i]);
//		}
//				
//String name = JOptionPane.showInputDialog("Enter name");
//JOptionPane.showMessageDialog(null, "Hello "+name);
//int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter your age"));
//JOptionPane.showMessageDialog(null,"You are "+age );
//
//double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height "));
//javax.swing.JOptionPane.showMessageDialog(null, "You are "+height+ "cm");

    

//		System.out.println("what is your name? ");
//		String name = scanner.nextLine();
//		System.out.println("Where do you live ? ");
//		String home = scanner.nextLine();
//		System.out.println("How old are you? ");
//		int age = scanner.nextInt(); 
//		scanner.nextLine();
//		System.out.println("What do you wanna do when you grow up? ");
//		String career = scanner.nextLine();
//		
//		System.out.println("Hello "+name);
//		System.out.println("You live "+home);
//		System.out.println("You are "+age+" years old");
////		System.out.println("You want to be "+career);
//		  System.out.println("Enter Your name: ");
//	        String name = scanner.nextLine();
//	        System.out.println("How old are you: ");
//	        int age = scanner.nextInt();
//	        scanner.nextLine();
//	        System.out.println("What is the level of education have you completed: ");
//	        String education = scanner.nextLine();
//	        System.out.println("What experience do you have in this Job: ");
//	        double experience = scanner.nextDouble();
//	        System.out.println("What's your Finacial expectation: ");
//	        double salary = scanner.nextDouble();
//	        System.out.println("What is your period of notice: ");
//	        int notice = scanner.nextInt();
//
//	        System.out.println("Good morning "+name);
//	        System.out.println("You are "+age+"years old");
//	        System.out.println("You completed "+education);
//	        System.out.println("You worked in this field: "+experience+" years");
//	        System.out.println("You want to be paid "+salary+" PLN");
//	        System.out.println("You will start job after "+notice+" days");
	
		

		Scanner scanner = new Scanner(System.in);
		
//		
//		int rows=4;
//		int columns=5;
//		String symbol = "#";
//		System.out.println("Enter no of rows ");
//		rows = scanner.nextInt();
//		System.out.println("Enter no of columns ");
//		columns = scanner.nextInt();
//		System.out.println("Enter symbol to use ");
//       	symbol = scanner.next();
//		
//		for(int i=1; i<=rows; i++) {
//			System.out.println();
//			for(int j = 1; j<=columns; j++) {
//			System.out.print(symbol);
//			}
//		}
//		
	
//		int[][] cars = new int[4][4];
//		cars[0][0] = 1000;
//		cars[0][1] = 2000;
//		cars[0][2] = 3000;
//		cars[0][3] = 4000;
//		cars[1][0] = 5000;
//		cars[1][1] = 6000;
//		cars[1][2] = 7000;
//		cars[1][3] = 8000;
//		cars[2][0] = 9000;
//		cars[2][1] = 1001;
//		cars[2][2] = 2002;
//		cars[2][3] = 3003;
//		cars[3][0] = 4004;
//		cars[3][1] = 5005;
//		cars[3][2] = 6006;
//		cars[3][3] = 7007;
//		
//		System.out.println(cars[0]);
//		for(int i = 0; i<cars.length; i++) {
//			System.out.println();
//			for(int j=0; j>cars[i].length; i++) {
//				System.out.print(cars[i][j] + " ");
//			}
//			System.out.println(cars[i]);
//		}
// 			
	
        	
//       String[][] cars  ={ { "corolla", "corvette", "Cardilac",},{ "chevrolet", "Jumbo"}};
//       System.out.println(cars[3]);
//       for(int i = 0; i < cars.length; i++) {
//    	   System.out.println(cars[i]);
//       }
        
//		String = reference data type that can store one more characters 
//		refernce data type are data types that access to useful methods
//		String name = "Bonheur";
//		boolean result = name.equalsIgnoreCase("bro");
//		int result = name.length();
//		char result = name.charAt(1);
//		int result = name.indexOf("B");
//		String result = name.toUpperCase();
//		String result = name.toLowerCase();
//		Boolean result = name.isEmpty();
//		String result = name.trim();
//		String result = name.replaceAll("Bonheur", "Ndamukunda");
//	
//		System.out.println(result);
        
//        	String name = "Bonheur";
//    		boolean response = name.equalsIgnoreCase("bonheur");
//      	int response = name.length()
//          char response = name.charAt(3);
//    	    int response = name.indexOf("h");    
//        	boolean response = name.isEmpty();
//        	String response = name.toUpperCase();
//        	String response = name.toLowerCase();
//        	String response = name.trim();        
//          System.out.println(name);
//        	String response = name.replace("Bonheur", "Ndamukunda");		
//        System.out.println(response);
        
//		
//		Boolean X = true;
//		Character y = '2';
//		Integer r = 2;
//		Double x = 3.12;
//		String b = "w";
//		
		
//		
//		ArrayList<String> food = new ArrayList<>();
//		food.add("pizza");
//		food.add("wrap");
//		food.add("omlet");
//		food.add("Chicken legs");
//		System.out.println(food.get(2));
//		for(int i=0; i<food.size(); i++) {
////			System.out.println(food.get(i));
//		}
////		
//		 ArrayList<String>shoes = new ArrayList<>();
//		    shoes.add("Jordan1");
//		    shoes.add("Jordan11");
//		    shoes.add("Adidas");
//		    shoes.add("Nike");
//		    shoes.add("puma");
//		    
//		    System.out.println(shoes.get(1));
//		    System.out.println(shoes.size());
//		    System.out.println(shoes);
//		    for(int i = 0; i< shoes.size(); i++) {
//		    System.out.println(shoes.get(i));
		    
		    
////		    }
//		 ArrayList<ArrayList<String>>grocerylist = new ArrayList<>();
//		    ArrayList<String>bakerylist = new ArrayList<>();
//		    bakerylist.add("noodles");
//		    bakerylist.add("garlic bread");
//		    bakerylist.add("sphagetti");
//		    bakerylist.add("donuts");
//		    bakerylist.add("cake");
//
//		    ArrayList<String>producelist = new ArrayList<>();
//		    producelist.add("vegetables");
//		    producelist.add("rice");
//		    producelist.add("posho");
//		    producelist.add("butter");
//		    ArrayList<String>drinkslist = new ArrayList<>();
//
//		    drinkslist.add("Beer");
//		    drinkslist.add("Liquor");
//		    drinkslist.add("Vin rouge");
//		    drinkslist.add("soda");
//
//		    grocerylist.add(bakerylist);
//		    grocerylist.add(producelist);
//		    grocerylist.add(drinkslist);
//		    System.out.println(grocerylist);
//		    System.out.println(grocerylist.get(0));
//		    System.out.println(grocerylist.get(1).get(0));
		String name = "Bro"; 
		
//		boolean result = name.equals("Bro");
//		int result = name.length();
//		char result = name.charAt(2);
//		int result = name.indexOf('r');
//		boolean result = name.isEmpty();
//		String result = name.toLowerCase();
//		String result = name.toUpperCase();
//		String result =name.trim();
//		String result = name.replace("Bro", "Bonheur");
//		
//		System.out.println(result);
		
		
//		    
	}

}
