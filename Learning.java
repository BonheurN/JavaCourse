
public class Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza pizza = new Pizza("Thin Crust", "Diabro","Mozzerella");
		System.out.println("These are ingredients used to make your pizza");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
	}

}
class Pizza{
	String bread;
	String sauce;
	String cheese;
	String topping;
	Pizza(String bread, String sauce){
		System.out.println(" this is overloaded constructors #1");
		
		this.bread = bread;
		this.sauce = sauce;
		
	}
	Pizza(String bread,String sauce,String cheese){
		System.out.println("This is overloaded constructors #2");
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	Pizza(String bread,String sauce,String cheese,String topping){
		System.out.println("This is overloaded constructor");
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
}