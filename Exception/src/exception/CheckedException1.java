package exception;

public class CheckedException1 extends Exception{

	public void checkMethod(int a,int b) {
		int c;
		try {
			c=a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		CheckedException1 e1=new CheckedException1();
		e1.checkMethod(10, 0);
	}
}
