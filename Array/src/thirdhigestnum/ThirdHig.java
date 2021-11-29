package thirdhigestnum;

public class ThirdHig {

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
		int arr[]= {3,45,6,7,34,3,5,32,54,2,42};
		int a[]=getSortedArray(arr);
		for(int ele:a) {
			System.out.println("Third Highest number is  "+a[a.length-3]);
			break;
		}
	}
}
