package array_Project_sorting;

import java.io.IOException;

public class Sorting_array_simpleMethod {

	int array[] = {2,3,4,6,10,45,38,56,77,84,90,33};
	
	public void sort(int value) {
		
		int index = 0;
		
		boolean flag = false;
		
	
		
		for(int i = 0; i<= array.length; i++)
		{
			if(array[i] == value)
			{
				index=i;
				
				flag = true;
				break;
			}
			
			}
		if(flag)
		{
			System.out.println("Index of 84 is:-"+index);
		}
		else
		{
			System.out.println("Not value is not present:-"+index);
		}
		}
	
	
	public static void main(String[] args) {
		
		Sorting_array_simpleMethod sortingMethod = new Sorting_array_simpleMethod();
		
		sortingMethod.sort(10);
	}

}
