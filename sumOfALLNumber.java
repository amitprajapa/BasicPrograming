//wap to find sum of all the in range 1-5

public class sumOfALLNumber {
public static void main(String[] args) {
	
	int sum=0;
	for(int i=1; i<=5; i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
	//////sum of all number range 1-50
	int s=0;
	for(int a=1; a<=50; a++)
	{
		s=s+a;
	}
	System.out.println(s);
	
	int x=0;
	for(int y=50; y>=1; y--)
	{
		x=x+y;
		
	}
	System.out.println(x);
	
			
}
}
