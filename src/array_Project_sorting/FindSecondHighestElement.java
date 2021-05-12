package array_Project_sorting;

import java.util.Arrays;

public class FindSecondHighestElement {

	public static void main(String[] args) {
	
		FindSecondHighestElement findElement = new FindSecondHighestElement();
		int[] arr1 = { 7, 5, 6, 1, 4, 2, 45, 78,43,0,99,67 };
		
		int resultSecondHighest = findElement.SecondHighestElement(arr1);
		
		System.out.println("Second Highest element: " + resultSecondHighest);
		
		int[] arr2 = { 7, 5, 6, 1, 4, 2, 45, 78,43,0,99,67 };
		
		//int resultSecondlowest = findElement.SecondlowestElement(arr2);
		
		
		System.out.println("Second Smallest: "+ findElement.SecondlowestElement(arr2,6));  

	}
	
	public static int SecondHighestElement(int[] arr)
	{
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i = 0; i<=arr.length-1; i++)
		{
			if(arr[i]>highest)                       // If current element is greater than highest
			{
				secondHighest = highest;				// assign second highest element to highest element
				highest = arr[i];						// highest element to current element
			}
			else if(arr[i]>secondHighest)
			{
				secondHighest = arr[i];
			}
		}
		return secondHighest;
	}
	
	public static int SecondlowestElement(int[] array,int total)
	{
		Arrays.sort(array);  
		return array[1];  
		}  
		
	}

