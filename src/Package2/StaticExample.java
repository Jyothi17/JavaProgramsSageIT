package Package2;

public class StaticExample {

	public static int a =10;
	int b =20;
	public static void main(String[] args)
	{
		StaticExample se = new StaticExample();
		System.out.println(a);
		System.out.println(se.add());
		
	}
	public int add()
	{
		return b;
	}
}
