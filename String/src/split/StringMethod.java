package split;

public class StringMethod {

	public static void main(String args[]) {
		String str="hello welocome to zoo";
		String words[]=str.split("\\s");
		for(String element:words) {
		System.out.println(element);
	}
}
}
