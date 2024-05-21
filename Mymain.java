
public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGarage garage = new MyGarage();
		MyCar car = new MyCar("BMW");
		MyCar kar = new MyCar("Supra");
		
		garage.park(car);
		garage.park(kar);
		
		
	}

}
class MyCar{
	String name;
	MyCar(String name){
		this.name = name;
	}
}
class MyGarage{
	void park(MyCar kar) {
		System.out.println("The "+kar.name+" is parked in my garage");
		
	}

	
}