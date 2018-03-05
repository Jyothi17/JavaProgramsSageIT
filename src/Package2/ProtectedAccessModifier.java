package Package2;

public class ProtectedAccessModifier {
	
	public static void main(String[] args)
	{
		AccessModifiers am = new AccessModifiers();
		System.out.println("Calling the Protected Method within the same package "+am.add());
		System.out.println("Calling the Protected Variable within the same package "+am.c);
	}

}
