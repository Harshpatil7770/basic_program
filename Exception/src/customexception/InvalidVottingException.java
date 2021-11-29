package customexception;

import java.util.Scanner;

public class InvalidVottingException extends Exception {

	InvalidVottingException(String str){
		super(str);
	}	
}
class votter{
	public static int getEligibleCriteria(int age) throws InvalidVottingException {
	if(age<18) {
		throw new InvalidVottingException("Not eligible for votting");
	}else {
		System.out.println("Eligible for votting");
	}
	return age;
}
	public static void main(String args[]) throws InvalidVottingException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age::");
		int age=sc.nextInt();
		getEligibleCriteria(age);
	}
}
