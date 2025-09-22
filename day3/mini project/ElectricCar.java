package car;

public class ElectricCar extends Car{
	int batteryCapacity;
	ElectricCar(String brand,int model,int year,int door,String fuel,int batteryCapacity){
		super(brand,model,year,door,fuel);
		this.batteryCapacity=batteryCapacity;
	}
	void displayElectricCarInfo()
	{
		System.out.println("Brand:"+this.brand+"\nModel:"+this.model+"\nYear:" + this.year+" "+ "Door:"+ this.door+" "+"Fuel:"+this.fuel+" "+ "battery:"+this.batteryCapacity);
	}

}
