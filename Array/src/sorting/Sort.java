package sorting;

public class Sort {

	public static int[] getSorted(int arr[]) {
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
		int a[]= {23,3,44,5,34,435,54,323,454,54};
		int arr[]=getSorted(a);
		for(int element:arr) {
			System.out.println(element);
		}
	}
}
