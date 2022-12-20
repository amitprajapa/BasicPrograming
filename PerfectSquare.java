
public class PerfectSquare {
public static void main(String[] args) {
	int n=64;
	boolean b= false;
	for(int i=1; i*i<=n; i++)
	{
		if(i*i==n)
		{
			b=true;
			System.out.println("Perfect Square");
		}
			
	}
	if(b==false)
	{
		System.out.println("Not Perfect Square");
	}
}
}
