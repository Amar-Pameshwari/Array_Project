package array_Project_sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class ArrayListToSet {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList alist = new  ArrayList();
		
		alist.add(12);
		alist.add(23);
		alist.add(54);
		alist.add(12);
		alist.add(54);
		alist.add(124);
		alist.add(98);
		
		System.out.println("Inital Array list: " + alist);
		//Remove duplicate from the list without using remove
		
		HashSet hSet = new HashSet(alist);
		System.out.println("Remove the duplicate " + hSet);
		
		//Sort using collections
		Collections.sort(alist);
		System.out.println("Sort the list " + alist);
		
		//Remove Duplicate & Sort
		TreeSet tSet = new TreeSet(alist);
		
		System.out.println("Remove duplicate and Sort the array " +  tSet);
		
		
		
	}

}
