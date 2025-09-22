package car;

public class Car extends Vehicle {
    protected int door;
	protected String fuel;
	Car(String brand,int model,int year,int door,String fuel) {
		super(brand,model,year);
		this.door=door;
		this.fuel=fuel;
	}
	void displayCar()
	{
		super.displayVehicleInfo();
		System.out.println("Door:"+this.door+" "+"\nFuel:"+this.fuel);
	}

}
