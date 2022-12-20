import java.util.Scanner;

public class Odd_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number a: ");
	int a=sc.nextInt();
	System.out.println("Enter Number b: ");
	int b=sc.nextInt();
	for(int i=a; i<=b; i++)
	{
		if(i%2==1)
		{
			System.out.println(i);
		}
		
	}
}
}
