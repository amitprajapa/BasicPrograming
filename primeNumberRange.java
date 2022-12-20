import java.util.Scanner;

//wap to find all the prime numbers in the range of 1 to 100
public class primeNumberRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Number ");
		//int n=sc.nextInt();
		
		for(int n=1; n<=100; n++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n);
			}
		}
		
	}

}
