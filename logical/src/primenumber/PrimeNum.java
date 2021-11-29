package primenumber;

import java.util.Scanner;

public class PrimeNum {
public static void main(String args[]) {
	int num;
	int temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ::");
	num=sc.nextInt();
	if(num==0 || num==1) {
		System.out.println("Not A Palindrom Number");
	}else {
		for(int i=2;i<=num/2;i++) {
			if(num%i!=0) {
				System.out.println("Not a prime number");
				temp=1;
				break;
			}
		}
		if(temp==0) {
			System.out.println("Prime Number");
		}
	}
}
}
