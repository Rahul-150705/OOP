package car;

public class Supercar extends Car {
	int speed;
	Supercar(String brand,int model,int year,int door,String fuel,int speed) {
		super(brand,model,year,door,fuel);
		this.speed=speed;
	} void display()
	{
		super.displayCar();
		System.out.println("Speed:"+this.speed);
	}

}
