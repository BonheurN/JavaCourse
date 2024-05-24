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
		for(String i:mycollection){
			System.out.println(i);
		}
String [][]cars = new String[4][5];
	cars[0][0] = "RAV4";
	cars[0][1] = "Carina";
	cars[0][2] = "hybrd";
	cars[0][3] = "V8";
	cars[0][4] = "motorolla";
	cars[1][0] = "corvette";
	cars[1][1] = "tesla";
	cars[1][2] = "lambo";
	cars[1][3] = "ferrari";
	cars[1][4] = "corolla";
	cars[2][0] = "honda";
	cars[2][1] = "scoda";
	cars[2][2] = "volvo";
	cars[2][3] = "golf";
	cars[2][4] = "hyundai";
	cars[3][0] = "porsche";
	cars[3][1] = "ranger";
	cars[3][2] = "rover";
	cars[3][3] = "merdedez";
	cars[3][4] = "cross country";
System.out.printl(cars[2][1]);
		for(int i=0; i<cars.length; i++) {
		System.out.println();
		for(int j=0; j<cars[i].length; j++) {
			System.out.println(cars[i][j]+ " ");
		
	}	
}
class Food{
	String name;
	Food(String name){
		this.name =name;
	}
}
