package throwkeyword;

import java.util.Scanner;

public class Votter extends Exception{

	public static int getEligibilityCriteria(int age) {
		if(age<18) {
				throw new ArithmeticException("Not eligible for votting");
			}else{
				System.out.println("Eligible for votting");
			}
		return age;
		}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age ::");
		int age=sc.nextInt();
		getEligibilityCriteria(age);
	}
}
