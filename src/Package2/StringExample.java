package Package2;

public class StringExample {
	
	public static void main(String[] args)
	{
		String s = "Cassandra Mexico";
		if(s.isEmpty())
		{
			System.out.println("String is Empty");
		}
		else
		{
			System.out.println("String is not Empty");
		}
		if(s.startsWith("ab"))
		{
			System.out.println("String starts with ab");
			
		}
		else
		{
			System.out.println("String does not starts with ab");
		}
		
		String sub = s.substring(12);
		System.out.println("Substring is "+sub);
		
		char[] c = s.toCharArray();
		for(int i = 2 ;i <s.length();i+=2)
		{
		System.out.println("Even Characters in the String " + c[i]);
		}
		
		System.out.println("Character at 5 is : "+s.charAt(4));
		
		System.out.println("Index of C is : "+ s.indexOf('C'));
		
		String[] sp = s.split(" ");
		for(String s2:sp)
		{
		System.out.println("Splited String : "+s2);
		}
		
		System.out.println("Subsequence of the String: "+s.subSequence(2, 9));
		
		String re = s.replace('a', 'b');
		System.out.println("Character replace of a with b : "+re);
		
	}

}
