package uncheckedexception;

public class UncheckedEx extends Exception {

	public void m1() {
		int a=10/0;
	}
	void n1(ArithmeticException e) {
		e.printStackTrace();
	} 
	void p1(Exception e) {
		e.printStackTrace();
	}
	public static void main(String args[]) {
		UncheckedEx e1=new UncheckedEx();
		e1.m1();
	}
}
