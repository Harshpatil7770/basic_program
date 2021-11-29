package sorting;

public class Selection {

	public static int[] getSelectionSortedArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String args[]) {
		int a[]= {20,2,32,43,4,3,2,43,5,53,32,32};
		int arr[]=getSelectionSortedArray(a);
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
}
