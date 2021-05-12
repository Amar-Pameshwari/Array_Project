package array_Project_sorting;

public class binarySearchSorting 
{
	
	private static int searchIteration(int arr[], int value)
	{
			int high = arr.length-1, low = 0;
			int mid;
			
			while(low <= high)
			{
					mid = low + ((high-low)/2);
				
				if(arr[mid] == value)
				{
					return mid;
				}
				else if(value < arr[mid])
				{
					high =  mid - 1;
				}
				else
				{
					low = mid + 1;
				}
				
			
			}
			
			return -1;

	}

	
	public static void main(String[] args) 
	{

		binarySearchSorting binarySearch = new binarySearchSorting();
		
		
		int array[] = {4,5,6,7,2,8,60,50,40,30,10};
		
		int index = binarySearch.searchIteration(array,2);
		
		System.out.println("Index is : " + index);
	}
		
	
}
