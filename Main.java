import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		Scanner scanner = new Scanner (System.in);
		
//		nested loop = a loop inside of a loop
//		
//		int rows ;
//		int columns ;
//		String symbol ="";
//		
//		System.out.println("Enter No of rows: ");
//		rows = scanner.nextInt();
//		System.out.println("Enter No of columns: ");
//		columns = scanner.nextInt();
//		System.out.println("Enter symbols to use");
//		symbol = scanner.next();
//		
//		for(int i=1; i<=rows; i ++) {
//			System.out.println();
//			for(int j =1; j<=columns; j++) {
//				System.out.print(symbol);
//			}
//		}
//		Array = used to store multiple values in a single variable
//		String[] cars = {"volvo", "Skoda", "Covette", "Tesla"};
//		cars[1] = "Mitsubishi";
//		System.out.println(cars[0]);
//		System.out.println(cars[1]);
//	int rows;
//	int columns;
//	String symbol;
//	System.out.println("Enter No of rows: ");
//	rows=scanner.nextInt();
//	System.out.println("Enter No of columns: ");
//	columns=scanner.nextInt();
//	System.out.println("Enter symbol to use");
//	symbol = scanner.next();
//	
//	for(int i =1; i <= rows; i++ ) {
//		System.out.println();
//		for(int k = 1; k <= columns; k++) {
//			System.out.print(symbol);
//		}
//	}
//	
//	String[] food = new String[4];
//	food [0]= "pierogi";
//	food [1]= "pizza";
//	food [2]= "burger";
//	food [3]= "wrap";
//	
//	for(int i=0; i<food.length; i++) {
//		System.out.println(food[i]);
//	}
//	System.out.println(food[1]);
//	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

	
//	
//		String[][] cars = { {"Corvette", "Tesla", "F150", "Lamborghini"}, 
//				            {"Ferari", "Bughatti", "Supra", "Chevrolet"},
//				            {"Yaris", "Mustanga", "Mitsubishi", "Corolla"},
//				            {"Hyundai", "Skoda", "Honda", "Prius"}
//				          };
//		
//		for(int i = 0; i<cars.length; i++) {
//			System.out.println();
//			for(int j = 0; j<cars[i].length; j++) {
//				System.out.print(cars[i][j] + " ");
//			}
//		}
//		
//		System.out.println(cars[1]);
//		System.out.println(cars[0]);
//		System.out.println("Enter day");
//		String day = scanner.nextLine();
//		
//		switch(day) {
//		case "Monday": System.out.println("It's the first day of the week ");
//		break;
//		case "Tuesday": System.out.println("It's a day I take my kids to school");
//		break;
//		case "Wednesday": System.out.println("It's the that I go to church ");
//		}
//	
//		System.out.println("Enter temp: ");
//		int temp = scanner.nextInt();
//		
//		if(temp>30) {
//			System.out.println("To day it was very hot ");
//			System.out.println("We need to go to the beach for refreshing ");
//		}
//		else if(temp>=20 && temp<=30) {
//			System.out.println("To day we had a good weather");
//			System.out.println("Children spent the whole day playing outside");
//		}
//		else {
//			System.out.println("Today it is cold day wha a weather!");
//			System.out.println("Noone went outside even the taxis were not available");
//		}
//		
//		System.out.println("You are playing a game! Press q or Q to quit.");
//		String response = scanner.next();
//		
//		if(response.equals("q") || response.equals("Q")) {
//			System.out.println("You quit the game ");
//		}
//		else {
//			System.out.println("You are still playing");
//		}
		
//		System.out.println("You are playing a game! Press q or Q to quit.");
//		String response = scanner.next();
//		
//		if(!response.equals("q") && !response.equals("Q")) {
//			System.out.println("You are still playing");
//		}
//		else {			
//			System.out.println("You quit the game ");
//		}
//		String x = "";
//		
//		while(x.isBlank()) {
//			System.out.println("Enter value of X: ");
//			x = scanner.nextLine();
//		}
//		System.out.println(x+", I like it ");
//		
//		ArrayList<String>shoes = new ArrayList<>();
//		shoes.add("J1");
//		shoes.add("J11");
//		shoes.add("Curry");
//		shoes.add("Lebron");
//		shoes.add("kobe");
		
//		System.out.println(shoes.get(0));
//		System.out.println(shoes.get(2));
//		System.out.println(shoes.get(1));
//		for(int i=0; i<shoes.size(); i++) {
////			System.out.println(shoes.get(i));
//		}
		ArrayList<Integer>num = new ArrayList<>();
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(7);
		num.add(9);
		num.set(1, 20);
		num.set(0,19);
		num.remove(3);
		num.clear();
//		System.out.println(num.get(0));
//		for(int i=0; i<num.size(); i++) {
//			System.out.println(num.get(i));
//		}
	}

}