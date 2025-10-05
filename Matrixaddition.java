package index2;

public class Matrixaddition {
public static void main(String[] args) {
	//creating two matrices
	int a[][]= {{1,3,4},{2,3,4},{3,4,5}};
	int b[][]= {{4,5,7},{8,9,10},{5,3,4}};
	//creating another matrix to store the sum of matrices
	int c[][]=new int[3][3];
	//adding and printing the addition of 2 matrices
	for (int i=0;i<3;i++)//roww
	{
		for(int j=0;j<3;j++) //column
		{
			c[i][j]=a[i][j]+b[i][j];// addition or sub
			System.out.print(c[i][j]+" ");
		}
		System.out.println();//new line
		}
}
}
