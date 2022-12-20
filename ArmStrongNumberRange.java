
public class ArmStrongNumberRange {
	public static void main(String[] args) {
		for(int i=1; i<=1000; i++)
		{
			int n=153, temp=n, sum=0, count = countOfDigits(n);
			while(n!=0)
			{
				int d= n % 10;
				sum=sum+ pow(d, count);
				n = n / 10;
			}
			
		}
	}
	
	public static int pow(int n, int p)
	{
		int res=1;
		for(int i=1; i<=p; i++)
		{
			res= res * n;
		}
		return res;
	}
	
	public static int countOfDigits(int n)
	{
		int count = 0;
		while (n!=0)
		{
			count++;
			n = n / 10;
		}
		return count;
	}

}
