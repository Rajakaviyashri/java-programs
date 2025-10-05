package index2;
//multiply two matrices program in java
import java.io.*;
//driver class
class MatrixMul{
//function to print matrix
	static void printMatrix(int M[][] ,int rowSize,int colSize) {
		for(int i=0;i<rowSize;i++) {
			for (int j=0;j<colSize;j++) {
				System.out.print(M[i][j]+"");
			}
			System.out.println();
		}
	}
		//function to multiply 
	//two matrices A[][] and B[][]
	static void multiplyMatrix(int row1,int col1,int A[][],int row2,int col2,int B[][]) {
		int i,j,k;
		//check if multiplication is possible
		if(row2 != col1) {
			System.out.println(	"\nmultiplication not possible");
			return;
			}
		//matrix to store the result
		// the product matrix will\
		//be of size row1*col2
		int c[][]=new int [row1][col2];
		//multiply the two nmatrix
		for(i=0;i<row1;i++) {
			for(j=0;j<col2;j++) {
				for(k=0;k<row2;k++) 
					c[i][j]+=A[i][k]*B[k][j];
				
			}
		}
		// print the result
		System.out.println("/nresultant matrix:");
		printMatrix(c,row1,col2);
		
		}
	//driver code
	public static  void main(String [] args) {
		int row1=4,col1=3,row2=3,col2=4;
		int A[][]= {{1,1,1},
				{2,2,2},
				{3,3,3},
				{4,4,4}};
		int B[][]= { {1,1,1,1},
				{2,2,2,2},
				{3,3,3,3}};
		multiplyMatrix(row1,col1,A,row2,col2,B);
		}
	}
	
	
