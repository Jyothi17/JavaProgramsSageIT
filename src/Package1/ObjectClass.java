package Package1;

public class ObjectClass {
	int a, b;
	public ObjectClass(int a,int b)
	{
		this.a = a;
		this.b = b;
		
	}
	public int hashCode()
	{
		return a;
	}
	public boolean equals(Object o)
	{
		ObjectClass occ = (ObjectClass)o;
		
		return Double.compare(a, occ.a) == 0 && Double.compare(b, occ.b) == 0;
	}
	
	public static void main(String[] args)
	{
		ObjectClass oc1 = new ObjectClass(10,20);
		ObjectClass oc2 = new ObjectClass(10,20);
		if(oc1.equals(oc2))
		{
			System.out.println("HashCode for OC object is : "+oc1.hashCode());
			System.out.println("HashCode for OC2 object is : "+oc2.hashCode());
			
			System.out.println("Two objects are equal");
		}
		else
		{
			System.out.println("HashCode for OC object is : "+oc1.hashCode());
			System.out.println("HashCode for OC object is : "+oc2.hashCode());
			
			System.out.println("Not Equal");
		}
	}
}
