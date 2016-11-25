import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Diamante {
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
	  int input = 9;
	  int num = (input/2)+1;
	  String pattern = "*";
	  Object[][] obj = new String[input][input];
	  
	  int i,j,k,l;

	    for(i=0;i<num;i++) // i == row
	    {
	      for(j=0;j<i;j++) // j == col 1 row 0, col 2 row 0 & row 1, col 3 row 0, 1, 2
	    	  				//col 4 row 0, 1, 2, 3, col 4 row 0, 1, 2, 3
	      {
	    	  obj[i][j]= " ";
	        System.out.print(" ");
	      }
	      for(k=0;k<num-i;k++)
	      {
	    	  obj[i][k + i] = "*";
	        System.out.print("*");
	      }
	      for(l=0;l<num-i-1;l++)
	      {
	    	  if(i <= input/2-l)
	    	  {
	    		  obj[i][num + l] = "*";
//	    		  System.out.print("*");
	    	  } else {
	    		  obj[i][num + l] = " ";
	    		  // not working dko alam kung baket wtf
	    	  }
//	    	  System.out.print(obj[i].length);
	    	  
//	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    

	    for(i=0;i<num-1;i++)
	      {
	    	
	        for(j=0;j<num-i-2;j++)
	        {
//	          obj[num + i][j] = " ";
	          System.out.print(" ");
	          
	        }
	        for(k=0;k<i+2;k++)
	        {
//	         obj[num + i][k] = "*";
	          System.out.print("*");
	          
	        }
	        for(l=0;l<i+1;l++)
	        {
//	        	obj[input/2 + l][input/2 - l] = "*";
	          System.out.print("*");
	        
	        }
	        System.out.println();
	      }
	  
	  
	  
	  
	  
	  
	  
	/*  for(int i=0; i < num/2; i++ ) {
//		  System.out.print(i);
			    for(int j = num - i; j < num; j++) { //spaces
			        System.out.print(" ");
//			        System.out.print(j);
			        obj[i][j] = " ";
			    }
			    for(int j = 0; j < num - 2*i; j++) { //pattern
			        System.out.print(pattern);
//			        System.out.print(j);
			        obj[i][j] = pattern;
			        
			    }
			    System.out.println();
			}*/
	  		// PRINT LOWER PART 
	  	/*	System.out.println();
			for(int i=0; i < (num+1)/2; i++ )
			{
			
			    for(int j = 1; j <= num/2 - i; j++)
			        {
			    	System.out.print(" ");
			    	System.out.print(j);
//			    	obk
			        }
			    for(int j = 0; j <= i*2; j++)
			     {
			    	System.out.print(pattern);
			    	
			     }
			    System.out.println();
			    	
			    
			}*/
			// PRINT OBJ
			System.out.println();
			 for(int kz = 0; kz <= obj.length-1; kz++)
		   	 {
		   		 for(int kk = 0; kk < obj[kz].length; kk++)
		   		 {
		   			 System.out.print(obj[kz][kk]);
		   			 
		   		 }
		   		 System.out.println();
		   	 }
			 List<Object> list 	= new ArrayList<Object>(Arrays.asList(obj));
			 list.removeAll(Collections.singleton(null));
			

			 
  }
  
}