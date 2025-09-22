package car;

public class Vehicle {

	 String brand;
	 int model;
	 int year;
	Vehicle(String brand,int model,int year) {
		this.brand=brand;
		this.year=year;
		this.model=model;	
	}
	public void displayVehicleInfo() {
		System.out.println("Brand:"+this.brand+"\nModel:"+this.model+"\nYear:" + this.year);
		
	}

}
