package assesment_8_12_21;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		 int rows;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the no of rows");
	         rows = sc.nextInt();
	        
	        	 for (int i = 1; i <= rows*2; i++)
	             {
	        		 if(i % 2 != 0)
	        		 {
	        			 for (int j=1;j<=i;j++)
	                     {
	        				 if(j==1 || j==i)
	        				 {
	        					 System.out.print(1);
	        				 }
	        				 else
	        				 {
	        					 System.out.print(0);
	        				 }
	                    	 		
	                     }
	        			 System.out.println();
	        		 } 
	        		
	               
	             } 
	         }
	        
	}