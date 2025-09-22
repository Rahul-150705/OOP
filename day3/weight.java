package inheritan;

public class weight extends child {
	int weight;
	weight()
	{
		super();
		this.weight=-1;
	}
	public weight(int x,int y,int z,int weight) {
		super(x,y,z); // this will call the parent x,y,z constructor 
		this.weight = weight;
	}
	
	

}
