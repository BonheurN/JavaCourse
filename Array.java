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
	}	
}
class Food{
	String name;
	Food(String name){
		this.name =name;
	}
}