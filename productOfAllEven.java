//wap 
public class productOfAllEven {
public static void main(String[] args) {
	
	int prod=1;
	for(int i=1; i<=10; i++)
	{
		if(i%2==0)
		{
			prod=prod*i;
			
		}
		
	}
	System.out.println(prod);
}
}
