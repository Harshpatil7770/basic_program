package secondHig;

public class SecondHig {

	public static int[] getSortedArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int arr[]= {3,5,6,7,8,8,3,4,3};
		int a[]=getSortedArray(arr);
		for(int ele:a) {
			System.out.println("Second Highest value is ::+"+(a.length-2));
			break;
		}
	}
}
