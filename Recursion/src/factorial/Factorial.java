package factorial;

public class Factorial {

	public int getFactorial(int num) {
		if(num==1) {
			return 1;
		}
		return num*getFactorial(num-1);
	}
	public static void main(String args[]) {
		Factorial ft=new Factorial();
		int a=ft.getFactorial(5);
		System.out.println(a);
	}
}
