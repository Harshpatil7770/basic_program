package CheckedException;

import java.io.IOException;

public class CheckedExceptionPropagation2 extends Exception{

	public void m() throws IOException{
		throw new IOException("A device error");
	}
	void n() throws IOException{
		m();
	}
	void p() throws IOException{
		n();
	}
	public static void main(String args[]) throws IOException {
		CheckedExceptionPropagation2 e1=new CheckedExceptionPropagation2();
		try {
			e1.p();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
