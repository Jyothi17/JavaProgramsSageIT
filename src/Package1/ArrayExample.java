package Package1;

public class ArrayExample {
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		int arr2[] = new int[10];
		int j=2;
		for(int i =0;i<5;i++)
		{
			arr[i] = i;
		}
		for(int i =5;i<10;i++)
		{
			arr[i] = j;
			j++;
		}
		for(int k =0; k<arr.length;k++)
		{
			//System.out.println(arr[k]);
		}
		
		for(int z = 0; z<arr.length-1;z++)
		{
			for(int f = z+1;f<arr.length;f++)
			{
				if(arr[z] == arr[f] && (z!=f))
				{
				System.out.println(arr[f]);
				
				}
				else
				{
					
				}
			}
		}
	}
}
