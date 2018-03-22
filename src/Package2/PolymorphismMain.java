package Package2;

public class PolymorphismMain
{
	public static void main(String[] args)
	{
		Polymorphism2 p = new Polymorphism2();
		p.add(10, 20);
		p.sub(10, 20);
		p.sub(10, 20,30);
		
		Polymorphism1 p1 = new Polymorphism2();
		p1.add(20, 30);
		
		Polymorphism1 p2 = new Polymorphism1();
		p2.add(20, 30);
	}
}
