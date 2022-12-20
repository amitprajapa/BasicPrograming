//wap to finda the all special number in 1 to 100
public class SpecialNumberRange {
public static void main(String[] args) {
	for(int i=1; i<=100; i++)
	{
		int temp=i;
		int sum=0;
		int prod=1;
		while(i!=0)
		{
			int d= i % 10;
			sum=sum+d;
			prod=prod*d;
			i=i/10;
		}
		int b=sum+prod;
		
		if(temp==b)
		{
			System.out.println(b);
		}
		i=temp;
	}
	
}
}
