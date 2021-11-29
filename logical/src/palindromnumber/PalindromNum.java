package palindromnumber;

import java.util.Scanner;

public class PalindromNum {

	public static void main(String args[]) {
	int num,rem,rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number::");
	num=sc.nextInt();
	int temp=num;
	while(temp!=0) {
		rem=temp%10;       // 121%10 1    12/10 1.2
		rev=rev*10+rem; //  10+10      
		temp=temp/10;	   //    121%10 12.1 12
	}
	if(rev==num) {
		System.out.println("Palindrom number");
	}else {
		System.out.println("Not palindrom number");
	}
}
}