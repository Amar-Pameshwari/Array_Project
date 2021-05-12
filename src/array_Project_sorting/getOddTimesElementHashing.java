package array_Project_sorting;

import java.util.HashMap;
import java.util.Map.Entry;

public class getOddTimesElementHashing {

	public static void main(String[] args) {
		
		getOddTimesElementHashing getOdd = new getOddTimesElementHashing();
		
		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };
		
		System.out.println(getOdd.OddTimesNumber(array));

	}

	public static int OddTimesNumber(int[] arr)
	{
		
		HashMap<Integer, Integer> hshMap = new HashMap<Integer, Integer>();
		
		for(int i =0; i < arr.length; i++)
		{
			int elements = arr[i];
			
			if(hshMap.get(elements) == null)
			{
				hshMap.put(elements, 1);
			}
			else
			{
				hshMap.put(elements, hshMap.get(elements)+1);
			}
			
			
		}
		for(Entry<Integer, Integer> entry : hshMap.entrySet())
		{
			if(entry.getValue() % 2 == 1)
			{
				return entry.getKey();
			}
		}
		
		return -1;
	}
}
