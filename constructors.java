
public class constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human human = new Human("Bill",22,78.0,80000.00);
		Human humana = new Human("Thomas",89,80.0,1000000.00);
		human.drink();
		humana.eat();
		
		System.out.println(human.weight);
		System.out.println(humana.weight);
	}
}
class Human{
	String name;
	int age;
	double weight;
	double networth;
	Human(String name, int age, double weight, double networth){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.networth = networth;
		
		}
	void drink() {
		System.out.printf("%s is drinking capuccino\n", name);
		
	}
	void eat() {
		System.out.printf("%s is eating the pilao.\n", name);
	}
	}
