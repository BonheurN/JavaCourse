import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food[] refrigerator = new Food[3];
		Food food1 = new Food("Hamburger");
		Food food2 = new Food("Pizza");
		Food food3 = new Food("Hotdog");
		refrigerator [0] = food1;
		refrigerator [1] = food2;
		refrigerator [2] = food3;
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);

		String[] Cars = new String[3];
		Cars[0] = "Volvo";
		Cars[1] = "BMW";
		Cars[2] = "Benz";
		for(int i:Cars){
			System.out.println(i);
		}

		System.out.println(cars[0]);

ArrayList<String> mycollection = new ArrayList<>();
		mycollection[0].add("Lamborghini");
		mycollection[1].add("Ferrari");
		mycollection[2].add("Corvette");
		mycollection[3].add("Supra");
		System.out.println(mycollection.get(2));
	}	
}
class Food{
	String name;
	Food(String name){
		this.name =name;
	}
}
