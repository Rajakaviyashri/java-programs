package index1;
import java.util.Scanner;

public class Arraymultidimension {
//2d additional transpose subract division multiplication
	//data type [][] arrayname=new datatype[x][y]
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a [][]=new int[100][100];//row=100;column=100
		int row,col,i,j;
		System.out.println("enter the number of row");
		row=scan.nextInt();
		System.out.println("enter the number of column");
		col=scan.nextInt();
		//row,j-column
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.printf("enter the array element",i,j);
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("display 2D array elements is :");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
	}
		
	}
		System.out.println();
		}
}
