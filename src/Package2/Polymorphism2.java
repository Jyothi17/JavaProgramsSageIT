package Package2;

public class Polymorphism2 extends Polymorphism1{

	int a,b,c;
	public int add(int a,int b)
	{
		
		System.out.println("Inside Sub Class ");
		this.a = a;
		this.b = b;
		
		return a+b;
	}
	public int sub(int a, int b)
	{
		this.a = a;
		this.b = b;
		
		return a-b;
		
	}
	//Method Overloading
	public int sub(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		return a-b-c;
	}
	
}
