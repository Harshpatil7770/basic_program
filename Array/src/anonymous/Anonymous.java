package anonymous;

public class Anonymous {

	public  static int[] getElement(){
		return new int[] {3,4,6,6,3,5};
	}
	public static void main(String[] args) {
		int a[]=getElement();
		for(int ele:a) {
			System.out.println(ele);
		}
	}
}
