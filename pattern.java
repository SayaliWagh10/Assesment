import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		 int rows;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the no of rows");
          rows = sc.nextInt();
         for (int i = rows; i >= 0; i--)
         {
             for (int j = i; j <= rows; j++)
             {
                 System.out.print(j + " ");
             }
             System.out.println();
         }
     }


	}
