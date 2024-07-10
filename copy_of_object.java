
public class copy_of_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carat cara1 = new Carat("Chevrolet", "Camaro", 2022);
		Carat cara2 = new Carat("Ford", "Mustang", 2023);
		
		cara2.copy(cara1);
		
		System.out.println(cara2); 
		System.out.println(cara1);
		System.out.println(cara1.getMake());
		System.out.println(cara1.getModel());
		System.out.println(cara1.getYear());
		System.out.println(); 
		System.out.println(cara2.getMake());
		System.out.println(cara2.getModel());
		System.out.println(cara2.getYear());
		System.out.println();
		
		
	}
}
class Carat{
	private String make;
	private String model;
	private int year;
	Carat(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		 this.year = year;
	}
	public void copy(Carat x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
}