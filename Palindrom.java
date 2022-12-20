
public class Palindrom {
public static void main(String[] args) {
	int n=121;
	int temp=n;
	int rev=0;
	while(n!=0)
	{
		int d= n% 10;
		rev=rev * 10+ d;
		n=n/10;
	}
	if(temp==rev)
	{
		System.out.println("Number is Palindrome Number");
	}else
	{
		System.out.println("Number Is Not Palindrome Number");
	}
}
}
