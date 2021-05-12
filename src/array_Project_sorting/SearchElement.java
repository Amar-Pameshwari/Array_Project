package array_Project_sorting;

public class SearchElement {

	public static void main(String[] args) {
		
		SearchElement searchElement = new SearchElement();
		
		int[] array1 = {16, 19, 21, 25, 3, 5, 8, 10 };
		
		System.out.println("Index of element 8 : " + searchElement.search(array1, 8));
		
		int[] array2 = {6, 88, 101, 125, 220, 430, 500, 808 };
		
		System.out.println("Index of element 101 : " + searchElement.search(array2, 101));

	}

	
	public static int search(int[] arr, int number)
	{
		int low = 0, high = arr.length-1;
		int mid;
		while (low <= high) 
		{
			mid = low + ((high - low) / 2);
			if (arr[mid] == number) 
			{
				return mid;
			}
			if (arr[mid] <= arr[high]) 									// Right part is sorted
			{   								
				
				if (number > arr[mid] && number <= arr[high]) 
				{
					low = mid + 1;
				} 
				else 
				{
					high = mid - 1;
				}
			} 
			else 														// Left part is sorted
			{													
				if (arr[low] <= number && number < arr[mid]) 
				{
					high = mid - 1;
				} 
				else 
				{
					low = mid + 1;
				}
			}
		}
		return -1;
	}
	
}
