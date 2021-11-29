package palindromstring;

import java.util.Scanner;

public class PalindromString {
public static void main(String args[]) {
	String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.next();
    String str2="";
    for(int i=str.length()-1;i>=0;i--) {
    	str2+=str.charAt(i);
    }
    if(str2.equals( str)) {
    	System.out.println("Palindrom String");
    }else {
    	System.out.println("Not a palindrom String");
    }
}
}