//wap to count total number of digits in a number
public class CountDigits {
	public static void main(String[] args) {
		int n=98973;
		int count=0;
		while(n!=0)
		{
			count++;//count=count+1
			n=n/10;
		}
		System.out.println(count);
	}
}
