package Array_Practice;

public class minFind_array 
{

	static void min(int[] a)
	{
		
		int min = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(min>a[i])
			{
				min = a[i];
				
			}
		}
		System.out.println("Min Value:-> " + min);
	}
	public static void main(String[] args) {
		int[] arr = {100,20,50,70,10,3,1};
		min(arr);

	}

}
