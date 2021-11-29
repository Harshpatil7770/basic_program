package cubeandsqaure;

public class CubeAndSquare {

	public int getCube(int num) {
		return num*num*num;
	}
	public int getSquare(int num) {
		return num*num;
	}
	public static void main(String args[]) {
		CubeAndSquare cs=new CubeAndSquare();
		cs.getCube(3);
		System.out.println("Cube of the Number is :: "+cs.getCube(3));
		System.out.println("==================================");
		cs.getSquare(3);
		System.out.println("Square of the number is :: "+cs.getSquare(3));
	}
}
