
public class PalindromeNumberRange2 {
public static void main(String[] args) {
	
	for(int i=1; i<=100; i++)
	{
		int temp=i; 
		int rev=0;
		while(i!=0)
		{
			
			int d= i % 10;
			
			rev= rev * 10+d;
			
			i=i/10;
			
		}
	
		if(temp==rev)
		{
			System.out.println(rev);
		}
		i=temp;
		
	}
}
}
