package exception;
import java.util.*;
public class CheckedException2 extends Exception{

	public void getDivide(int a,int b) {
		int c=0;
		try {
			c=a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(c);
	}
	public static void main(String args[]) {
		CheckedException2 e2=new CheckedException2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A::");
		int a=sc.nextInt();
		System.out.println("Enter the value of b::");
		int b=sc.nextInt();
		
		e2.getDivide(a, b);
	}
}
