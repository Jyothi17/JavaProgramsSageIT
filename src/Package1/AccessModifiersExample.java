package Package1;

import Package2.AccessModifiers;

public class AccessModifiersExample {

	public static void main(String[] args)
	{
		AccessModifiers am = new AccessModifiers();
		System.out.println("Calling the public Method from different package "+am.sub());
		System.out.println("Calling the public Variable from different package "+am.a);
	}
}
