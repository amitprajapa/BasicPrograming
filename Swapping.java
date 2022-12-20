//wap to swap 2 number without using 3rd var
public class Swapping {
	public static void main(String[] args) {
		System.out.println("Swapping Using 3rd Var");
		int a=3;
		int b=8;
		System.out.println("Before Swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		int temp;
		temp=a; //temp=3
		a=b;//a=8
		b=temp;//b=3
		temp=b;//temp=3
		System.out.println("After Swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println("Swapping without Using 3rd Var");
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
	}

}
