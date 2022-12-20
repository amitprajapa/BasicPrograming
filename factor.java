import java.util.Scanner;

//WAP To find all the factor of all the number//

public class factor 
{
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Number: ");
	   int n=sc.nextInt();
	   //int  n=9;
	for(int i=1; i<=n; i++)
	{
		if(n%i==0)
		{
			System.out.println("Factor is :"+i);
		}
	}
			
	
   }
}
