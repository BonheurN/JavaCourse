import java.util.ArrayList;
import java.util.*;
public class Shoppinglist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		
		ArrayList<String>bakeryList = new ArrayList<>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String>produceList = new ArrayList<>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("pepper");
		
		
		ArrayList<String>drinkList = new ArrayList<>();
		drinkList.add("juice");
		drinkList.add("juice");
		drinkList.add("beer");
		
	
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		System.out.println(groceryList);
//		System.out.println(groceryList.get(0));
//		System.out.println(bakeryList);
//		System.out.println();
//		System.out.println(produceList);
//		System.out.println();
//		System.out.println(drinkList);
//		System.out.println(bakeryList.get(0));
//	    System.out.println(drinkList.get(0));
//		System.out.println(bakeryList.get(1));
	}

}
