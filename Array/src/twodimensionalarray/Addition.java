package twodimensionalarray;

public class Addition {
public static void main(String args[]) {
	int a[][]= {{2,3,4},{3,4,5},{3,4,5}}; // 3*3  i=3
	int b[][]= {{2,2,3},{3,4,5},{3,3,5}}; //3*3   j=3
	
	int c[][]=new int [3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			c[i][j]=a[i][j]+b[j][i];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}