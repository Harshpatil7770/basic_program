package equals;

public class StringMethod {

	public static void main(String args[]) {
		String str="Hello how are you?";
		String words[]=str.split("\\s");
		for(int i=0;i<words.length;i++) {
			if(words[i].equals("are")) {
				System.out.println("Found");
			}else {
				System.out.println("Not Present");
			}
		}
	}
}
