package inheritan;

public class parent{
	public static void main(String[] args)
	{
//		child child1=new child();
//		child child2=new child(1,2,3);
//		weight weight1=new weight(2,3,4,100);
//		child child1=new weight(2,3,4,500);
//		System.out.println(child1.x);
//		System.out.println(child1.weight); // this is not possilbe bcz reference variable determines the members that can be accessed not the onject 
//		child1.display();
		height h1=new height(1,2,3,61,185);
		System.out.println(h1.x + " " + h1.y + " " +h1.z + " " + h1.weight+ " " +h1.height);
		// System.out.println( weight1.x+" "+ weight1.y+" "+weight1.z+" " +weight1.weight );
		//child.weight+" " we cannot do this bcz parent cannot inherit child //
		
	}

}
