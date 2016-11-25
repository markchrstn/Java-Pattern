import java.util.*;
import java.lang.reflect.Array;
public class MultidimensionalArray {
    static Object revArray[][];
    public static void main(String[] args){

    Object array[][] = {
    		{"D", "G", "T", "U", "I", "HRAGA"},
    		{"H", "Y", "R", "Y","L"},
    		{1, 2},
    		{'A', 'd'},
    		{"G", "Y", "E", "B","K", "f"},
    		{"G", "Y", "E", "B","K"}};
    

    viewArray(array);
    System.out.println(" ");
    reverseArrayRows(array);
    viewRevArray(revArray);
    
}
   public static void viewRevArray(Object[][] a)
   {
	   for(int ii = 0; ii<a.length; ii++)
	    {
	    	System.out.println(Arrays.toString(a[a.length - ii - 1]));
	    }
   }
    
    
    public static void reverseArrayRows(Object[][] a){
   	 int rows = a.length;
   	 
   	 revArray = new Object[rows][];
     	 
   	 for(int ii = 0; ii < rows; ii++)
   	 {
   		 revArray[ii] = new Object[a[ii].length];
   	 }
   	 
   	 for (int i = 0; i < rows; i++) {
   	 	for (int j = a[i].length - 1; j >= 0; j--) {
   	     	revArray[i][a[i].length - 1 - j] = a[i][j];
   	     	}
   	 }
    }
    
    public static void viewArray(Object arr[][]){
   	 for(int k = 0; k <= arr.length-1; k++)
   	 {
   		 List<Object> list = Arrays.asList(arr[k]);
   	 	System.out.println(list);
   	 }
   	 
    }
    
}
