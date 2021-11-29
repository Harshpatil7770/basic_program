package swap;

public class Swapping {

	public static void main(String args[]) {
		int a=10;
		int b=20;
		
		System.out.println("Before swapping values of a:: "+a+" is and b::" +b );
		b=a;  //b=10
		a=b+b;
		System.out.println("After swapping values of a:: "+a+" is and b::" +b );
	}
}
