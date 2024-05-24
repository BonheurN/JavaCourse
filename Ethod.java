
public class Ethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String name = "Bruno";
		int age = 19;
		hello(name, age);
		methoid meth = new methoid("sulphuric acid", "acid", 721);
	}

	static void hello(String name,int age) {
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" Years old");
		System.out.println(meth.name);
		System.out.println(meth.classification);

	}
}
class methoid{
	String name;
	String classification;
	int year;
	methoid(String name, String classification, int year){
		this.name = name;
		this.classification = classification;
		this.year = year;
	}
}
