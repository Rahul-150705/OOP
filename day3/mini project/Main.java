package car;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose vehicle type to display:");
        System.out.println("1. Vehicle");
        System.out.println("2. Car");
        System.out.println("3. Electric Car");
        System.out.println("4. Sports Car");

        int choice = sc.nextInt();
        sc.nextLine();
        if(choice==1)
        {
        	System.out.print("Enter Brand: ");
            String sBrand = sc.nextLine();
            System.out.print("Enter Model: ");
            int sModel = sc.nextInt();
            System.out.print("Enter Year: ");
            int sYear = sc.nextInt();
            Vehicle s1=new Vehicle(sBrand,sModel,sYear);
            s1.displayVehicleInfo();
        }
        else if(choice==2)
        {
        	System.out.print("Enter Brand: ");
            String sBrand = sc.nextLine();
            System.out.print("Enter Model: ");
            int sModel = sc.nextInt();
            System.out.print("Enter Year: ");
            int sYear = sc.nextInt();
            System.out.print("Enter Doors: ");
            int sDoor = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Fuel Type: ");
            String sFuel = sc.nextLine();
            Car c1=new Car(sBrand,sModel,sYear,sDoor,sFuel);
            c1.displayCar();
        }
        else if(choice==3)
        {
        	System.out.print("Enter Brand: ");
            String sBrand = sc.nextLine();
            System.out.print("Enter Model: ");
            int sModel = sc.nextInt();
            System.out.print("Enter Year: ");
            int sYear = sc.nextInt();
            System.out.print("Enter Doors: ");
            int sDoor = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Fuel Type: ");
            String sFuel = sc.nextLine();
            System.out.print("Enter Battery Capacity (kWh): ");
            int battery = sc.nextInt();
            ElectricCar e1=new ElectricCar(sBrand,sModel,sYear,sDoor,sFuel,battery);
            e1.displayElectricCarInfo();
        }
        else if(choice==4)
        {
        	System.out.print("Enter Brand: ");
            String sBrand = sc.nextLine();
            System.out.print("Enter Model: ");
            int sModel = sc.nextInt();
            System.out.print("Enter Year: ");
            int sYear = sc.nextInt();
            System.out.print("Enter Doors: ");
            int sDoor = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Fuel Type: ");
            String sFuel = sc.nextLine();
            System.out.print("Enter Car Top Speed ");
            int speed = sc.nextInt();
            Supercar t1=new Supercar(sBrand,sModel,sYear,sDoor,sFuel,speed);
            t1.display();
        }
        else
        {
        	System.out.println("Invalid Choice");
        }
		
	}

}
