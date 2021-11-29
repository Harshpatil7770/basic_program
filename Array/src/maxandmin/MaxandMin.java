package maxandmin;

public class MaxandMin {
	public static void main(String[] args) {
		int arr[]= {3,5,6,2,6,7,2,7,3};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("Maximum number is ::"+max);
	}
}
