package Package1;

public class ExceptionHandling {
	
	public static void main(String[] args)
	{
		int n1 =100 , n2 =0,n3;
		try
		{
			n3 = n1/n2;
		}
		catch(ArithmeticException Exception )
		{
		System.out.println("Exception is : "+Exception);	
		}
		
	}

}
