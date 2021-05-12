package Array_Practice;

public class return_annonyms {

	
	  static int[] arrayReturn() { 
		  return new int[] {10,20,40,90,10}; 
		  }
	 
	public static void main(String[] args) {
		
		
		  int arr[] = arrayReturn();
		  
		  for(int i = 0; i<arr.length; i++) 
			  System.out.println(arr[i]);
		 
		
		/*
		 * //Below example for out of bound index when it's not declare -1 logic int
		 * arr[]={50,60,70,80}; for(int i=0;i<=arr.length-1;i++){
		 * System.out.println(arr[i]); }
		 */ 

	}

}
