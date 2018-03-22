package Package2;

public class Constructors {
	
	public Constructors()
	{
		System.out.println("No args Constructor");
	}
	
	public Constructors(String name)
	{
		System.out.println("One args Constructor");
	}
	
	public Constructors(String name, int a)
	{
		System.out.println("Two args Constructor");
	}
	
	public static void main(String[] args)
	{
		Constructors c = new Constructors();
		Constructors c1 = new Constructors("Java");
		Constructors c2 = new Constructors("Java",8);
	}
}
