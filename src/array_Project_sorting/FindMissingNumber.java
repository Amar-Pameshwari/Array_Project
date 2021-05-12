package array_Project_sorting;

public class FindMissingNumber {
	
	public static int missingNumber(int[] arr) {
		
		int n = arr.length+1;
		int sum = n * (n+1)/2;
		
		int restSum = 0;
		
		for(int i =0; i <arr.length; i++)
		{
			restSum = restSum + arr[i];
		}
		int missing = sum - restSum;
		return missing;
	}

	public static void main(String[] args) {
		
		FindMissingNumber findM = new FindMissingNumber();
		
		int[] array1 = {8, 9, 3, 5, 6, 1, 4, 2};
		
		System.out.println("First missing no: " + findM.missingNumber(array1));
		
		int[] array2 = {6, 3, 1, 2 , 4, 7};
		
		System.out.println("Second missing no: " + findM.missingNumber(array2));
	}

}
