package vehicle;

public class Main {
	public static void main(String[] args) {
		vehicle v=new vehicle();
		vehicle v1=new Car();
		vehicle v2=new Bike();
		vehicle v3=new Truck();
		v.rentalCost(0);
		v1.rentalCost(10);
		v.rentalCost(0);
		v2.rentalCost(5);
		v.rentalCost(0);
		v3.rentalCost(5);
	}

}
