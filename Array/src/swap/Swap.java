package swap;

public class Swap {

	public static void main(String args[]) {
		int a=30;
		int b=49;
		int temp;
		System.out.println("Before swapping values of a is:: "+a+" values of B is :: "+b);
		temp=b;
		b=a;
		a=temp;
		System.out.println("After swapping values of a is:: "+a+" values of B is :: "+b);
	}
}
