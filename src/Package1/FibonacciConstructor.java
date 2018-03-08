package Package1;

public class FibonacciConstructor {
	int num1;
	int num2;
	int num3 = 0;
	public FibonacciConstructor(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public void fibonacci()
	{
		System.out.println(num1);
		System.out.println(num2);
		
		while(num3 <= 1000)
		{
			
			num3 = num1+num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			
		}
		
	}
public static void main(String[] args)
{
	FibonacciConstructor fc = new FibonacciConstructor(0,1);
	fc.fibonacci();
}

}
