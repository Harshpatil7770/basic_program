package throwsKeyword;

import java.io.IOException;

public class CheckedException extends Exception {

	void m() throws IOException{
		throw new IOException("A device error");
	}
	void n() throws IOException{
		m();
	}
	void p() { 
		try {
			n();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		CheckedException e1=new CheckedException();
		e1.p();
	}
}
