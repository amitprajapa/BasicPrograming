
public class practice {
	public static void main(String[] args) {
		int n= 39;
		int temp=n;
		int sum=0;
		int prod=1;
		while(n!=0)
		{
			int d= n % 10;
			sum=sum + d;
			prod = prod * d;
			
			n = n / 10;
		}
		int b= sum+prod;
        if(temp==b)
        {
        	System.out.println("Special Number");
        }else
        {
        	System.out.println("Not Special Number");
        }
		
		}
}

