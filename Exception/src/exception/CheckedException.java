package exception;

public class CheckedException extends Exception {

	public void check()
	{
	int c;
	try {
		c=10/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	}
	public static void main(String args[]) {
		CheckedException e=new CheckedException();
		e.check();
	}
}
