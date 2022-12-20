//wap to find sum of digits until
// sum is a single digit number
public class countSingleDigits {
public static void main(String[] args) {
	int n=28;
	int sum=0;
	while(n!=0 || sum>9)
	{
		if(n==0)
		{
			n=sum;
			sum=0;
		}
		int d= n % 10;
		sum=sum+d;
		n=n/10;
	}
	System.out.println(sum);
     
}
}
