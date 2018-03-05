package Package2;

public class AccessModifiers {
	
	public int a =10;
	private int b= 20;
	protected int c =30;
	
	public static void main(String[] args)
	{
		AccessModifiers am = new AccessModifiers();
		System.out.println("Calling the Private Method with in the class: "+am.mul());
		System.out.println("Calling the Private Variable with in the Class: "+am.b);
		
	}
	public int sub()
	{
		return a-b-c;
	}
	protected int add()
	{
		return a+b+c;
	}
	private int mul()
	{
		return a*b*c;
	}
	
}
