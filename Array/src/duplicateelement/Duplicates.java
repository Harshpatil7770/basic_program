package duplicateelement;

public class Duplicates {

	public static int[] findDuplicateArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
		
		
		
		return arr;
	}
	public static void main(String args[]) {
		int a[]= {23,43,43,5,656,32,54,523,43,452,3254,434,2,5};
		int arr[]=findDuplicateArray(a);
	}
}
