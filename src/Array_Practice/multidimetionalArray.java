package Array_Practice;

public class multidimetionalArray {

	public static void main(String[] args) {

		//First Scenario
		
		int ab[] = {1,2,3,4};
		
		//Iterate first method
		for(int i=0; i<ab.length;i++)
			System.out.println(ab[i]);
		
		//Iterate 2nd Method
		for(int i: ab)
			System.out.println(i);
		System.out.println("-------------------------------");
		//Second Scenario
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0 ; i<=a.length-1; i++)
		{
			for(int j = 0 ; j <=a.length-1; j++)
			{
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		

	}

}
