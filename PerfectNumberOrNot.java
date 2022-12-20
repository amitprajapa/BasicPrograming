import java.util.Scanner;

//wap to find prefect number or  not
public class PerfectNumberOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int n=sc.nextInt();
	
	int sum=0;
	for(int i=1; i<n; i++)
	{
		if(n % i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==n) //1+2+3
	{
		System.out.println("Perfect Number");
	}
	else
	{
		System.out.println("Not A Perfect Number");
	}
}
}
