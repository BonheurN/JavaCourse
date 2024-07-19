
public class Gym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Lamborghini", "Yellow", "German");
		car.setName("Ferrari");
		System.out.println(car.getName());
	}
}
class Car{
	private String name;
	private String color;
	private String origin;
	
	Car(String name, String color, String origin){
		this.name = name;
		this.color = color;
		this.origin = origin;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getOrigin() {
		return origin;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
}
