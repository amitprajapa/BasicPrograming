//wap to fnnd the perfect square number from 1 to 100
public class PerfectSquareRange {
public static void main(String[] args) {
	
	for(int n=1; n<=100; n++)
	{
		for(int i=1; i*i<=n; i++)
		if(i*i==n)
		{
			
			System.out.println(n);
		}
	}
}
}
