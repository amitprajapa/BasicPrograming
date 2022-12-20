//wap to print the reverse value of a number
public class ReverseValueNumber {
public static void main(String[] args) {
	int n=97696;
	int rev=0;
	while(n !=0)
	{
		int d= n % 10;
		rev=(rev*10)+d;
		n=n/10;
	}
	System.out.print(rev);
}
}
