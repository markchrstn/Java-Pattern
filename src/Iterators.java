import java.util.Scanner;


public class Iterators {
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
   	 
    try{
   	 System.out.println("Input integer:");
   	 int input = sc.nextInt();
   	 if(input<0){
   		 System.out.println("Input positive integer.");
   	 }
   	 else{

   		
   		int size = 9,odd = 1, nos = size/2; // nos =number of spaces
   		Object[][] obj = new String[size][size];
   		for (int i = 1; i <= size; i++) { // for number of rows i.e n rows
            for (int k = nos; k >= 1; k--) { // for number of spaces i.e
                                                // 3,2,1,0,1,2,3 and so on
                System.out.print(" ");
                obj[i-1][k] = " ";
            }
            for (int j = 1; j <= odd; j++) { // for number of columns i.e
                                                // 1,3,5,7,5,3,1
                System.out.print("*");
                obj[i-1][j-1] = "*";
            }
            System.out.println();
            if (i < size/2+1) {
                odd += 2; // columns increasing till center row 
                nos -= 1; // spaces decreasing till center row 
            } else {
                odd -= 2; // columns decreasing
                nos += 1; // spaces increasing

            }
        }
   		 
    /*    for(int k = 0; k <= obj.length-1; k++)
      	 {
      		 for(int kk = 0; kk < obj[k].length; kk++)
      		 {
      			 System.out.print(obj[k][kk]);
      			 
      		 }
      		 System.out.println();
      	 }*/
        
        
       /* for (int row = 0; row < input; row++) {
        	for (int column = 0; column < input; column++) {
            	int min = Math.min(row+1, input-row);
            	if (column <= input / 2 - min || column >= input / 2 + min) {
                	System.out.print(" ");
            	} else {
                	System.out.print(input);
            	}
        	}
        	System.out.println();
    	}*/
   		 
   		 
   		 
   		 //   	drawCross(input);
//   	drawTry(input);
//   	drawCross2(6);
//   	drawSquare(input);
   	System.out.println(" ");
//   	 diamond2(input);
//   	 drawDiamond(input);
   	 }
   	 
    }catch(Exception e)
    {
   	 System.out.println("Input an integer.");
   	 
    }
   	 sc.close();
  }
public static void drawCross(int num){
  if (num % 2 != 0)  {
	     for(int i = 0; i < num; i++) {
	            for(int j = 0; j < num; j++) {
	                if((i == num / 2) || (j == num / 2)) 
	                    System.out.print("X");
	                else 
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }
	}

  
public static void drawTry(int input)
{
	for(int row = 0; row  < input; row++)
	{
		for(int column = 0; column < input; column++)
		{
			if((column == input/2 - 1 || column == input/2)||(row == input/2-1 || row == input/2))
				System.out.print("X");
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
  public static void drawCross2(int num){

	  for(int i = 1; i <= num; i++) 
	  {
	         for(int j = 1; j <= num; j++) 
	         {
	        	 int min = Math.min(i+1, num-i);
	             if((i == num / 2) || (j == num / 2)) 
	                 System.out.print("X");

	             else 
	                System.out.print(" ");

	     }
	     System.out.println();
	         }

	 }


  
  	public static void drawSquare(int input)
  	{
   		 for(int i=1; i<=input; i++) {       
             System.out.println();	
             if(i==1 || i==input) {
                 for(int j=1; j<=input; j++){
                     System.out.print("*");
                 }
             } 
             else {
                 for(int k=1; k<=input;k++) {
                     if(k==1 || k == input) {
                         System.out.print("X");
                     }                    
                     else { 
                         System.out.print(" ");
                     }
                 }
             }
   		 }
  	}
 
  	
 
  public static void diamond2(int height) {
      
      for (int row = 0; row < height; row++) {
        	for (int column = 0; column < height; column++) {
            	int min = Math.min(row+1, height-row);
            	if (column <= height / 2 - min || column >= height / 2 + min) {
                	System.out.print(" ");
            	} else {
                	System.out.print("X");
            	}
        	}
        	System.out.println();
    	}
    }
}
