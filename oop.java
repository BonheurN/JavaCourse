
public class oop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		Car cara =new Car();
		System.out.println(car.color);
		System.out.println(cara.model);
		car.drift();
		cara.reverse();
	}

}
class Car{
	String make = "Toyota";
	String model ="Supra";
	String color = "Black";
	int year = 2020;
	double price =10000.00;
	void drift() {
		System.out.printf("There is no car that fits drifting like %s\n",model);
		
	}

void reverse() {
	System.out.printf("Reverse quicly %s",make); 
}
	
}
