package inheritan;

public class child {
	int x; // when used can be accessed only inside this class 
	int y;
	int z;
	child()
	{
		this.x=-1;
		this.y=-1;
		this.z=-1;
	}
	child(int x,int y,int z) // this will be called in super(x,y,z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void display()
	{
		System.out.println("printing the value");
		System.out.println(this.x);
	}
}
