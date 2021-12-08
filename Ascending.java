import java.util.Scanner;
public class Ascending {

	public static void main(String[] args) {
		    
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER THE SIZE OF ARRAY");
		        int size=sc.nextInt();
		        int arr[] = new int[size];
				int temp;
				
		        int i,j,sum=0;
		        System.out.println("ENETER THE "+ size +" NUMBER");
		        for(i=0;i<size;i++)
		        {
		            arr[i]=sc.nextInt();
		            
		        }
		        for(i=0;i<size;i++)
		        {
		           for(j=0;j<size;j++)
				   {
					   if(arr[i] <= arr[j])
					   {
						  temp=arr[i];
						  arr[i]=arr[j];
						  arr[j]=temp;
					   }
				   }
		        }
				System.out.println("SORTED ARRAY IS :- ");
				for(i=0;i<size;i++)
				{
					System.out.println(+arr[i]);
				}
				
		        
		    }
		}
