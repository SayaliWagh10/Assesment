import java.util.Scanner;

public class Primesum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int number,sum=0,temp=0;
        System.out.print("Enter a number: ");
        number=sc.nextInt();
        for(sum=0 ;number!=0 ;number/=10)
          {
          sum+=number%10;
          }
        for(int i=1;i<=sum;i++)
          {
          if(sum%i==0)
           temp++;
	  }
              System.out.println("Sum of the digits is: "+sum);
           if(temp==2)
	  	{
                   System.out.println(sum + " is a prime number.");
	        }
           else
		{
                    System.out.println(sum + " is not a prime number.");
	         }

}
}


