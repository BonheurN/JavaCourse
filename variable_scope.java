import java.util.Random;

public class variable_scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// local variable = are variables declared inside 
//		a method and only visible to that method
		
		
// global variable = variables clared outside 
//  the method but within aclass and are visible to all parts of class

	DiceRoller diceRoller = new DiceRoller();

		
	}
}
class DiceRoller{
	Random random; 
	int number ;
	DiceRoller(){
		random = new Random();
		number = 0;
		roll();

	}
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}