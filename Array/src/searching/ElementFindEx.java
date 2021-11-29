package searching;

public class ElementFindEx {

	public static void main(String args[]) {
		int a[]= {3,343,4,32,43,34,32,4,43,5,34};
		int n=5;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				System.out.println("Element Found::"+i+ "th index");
			}
		}
	}
}
