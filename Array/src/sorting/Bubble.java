package sorting;

public class Bubble {

	public static int[] getBubbleSortedArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String args[]) {
		int arr[]= {23,34,43,34,43,54,31,32,43,43};
		int a[]=getBubbleSortedArray(arr);
		for(int ele:a) {
			System.out.println(ele);
		}
	}
}
