package CheckedException;

import java.io.IOException;

public class CheckedExceptionPropagation extends Exception{

	void m1() {
		int a= 10/0;
	}
	void m2() throws IOException {
		m1();
	}
	void m3() throws IOException {
		m2();
	}
	public static void main(String args[]) throws Exception {
		CheckedExceptionPropagation e1=new CheckedExceptionPropagation();
		try {
			e1.m3();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
