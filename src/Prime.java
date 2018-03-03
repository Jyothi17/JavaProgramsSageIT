
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 4 ; i<=100;i++)
		{
			for(int j=2;j<=100;j++)
			{
			if(i%j == 0)
			{
				System.out.println(i);
			}
			}
		}

   }
}

