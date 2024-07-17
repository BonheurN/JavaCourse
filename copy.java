public class copy {
    public static void main(String[]args){
        Carer car1 = new Carer("Toyota","Supra",2023,40040.00);
        // Carer car2 = new Carer("Chevrollette", "Camaro", 2024, 50000.0);
        Carer car2 = new Carer(car1);
        // car2.copy(car1);
        // car.setMake("Chevrolette");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        // car1.setMake("Lamborghini");
       System.out.println(car1.getMake()); 
       System.out.println(car1.getModel());
       System.out.println(car1.getYear());
       System.out.println(car1.getPrice());

       System.out.println();

       System.out.println(car2.getMake()); 
       System.out.println(car2.getModel());
       System.out.println(car2.getYear());
       System.out.println(car2.getPrice());
    }
}
class Carer{
    private String make;
    private String model;
    private int year;
    private double price;
    Carer(String make,String model,int year,double price){

        this.setMake(make);
        this.setModel(model);
        this.setYear(year);;
        this.setPrice(price);;

    }
    Carer(Carer x){
        this.copy(x);
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setPrice(double price){
        this.year = year;
    }
    public void copy(Carer x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
        this.setPrice(x.getPrice());
    }
}