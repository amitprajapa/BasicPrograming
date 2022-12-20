import java.util.Scanner;

public class Foo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int n=sc.nextInt();
	for(int i=1; i<=n; i++)
	{
		if(i%5==0 || i%7==0)
		{
			System.out.println("FOOBOO");
		}
		
		else if(i%5==0)
		{
			System.out.println("FOO");
		}
		
		else if (i%7==0) {
			System.out.println("BOO");
		} 
		
	}
}
}
