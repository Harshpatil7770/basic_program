package maxandmin;

public class Minimum {

	public static void main(String[] args) {
		int a[]= {3,54,6,34,4,35,5,4,4545,34,3};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>min) {
				a[i]=min;
			}
		}
		System.out.println("Minimum Values is ::"+min);
	}
}
