package navinutube;
import java.util.*;
public class ArrayinMutlidimension {
public static void main(String []args) {
	Scanner obj=new Scanner(System.in);
	int a[][]=new int[100][100];
	int row,col,i,j;
	System.out.println("enter the number of rows");
	row=obj.nextInt();
	System.out.println("enter the number of column");
	col=obj.nextInt();
	for( i=0;i<row;i++) {
		for( j=0;j<col;j++) {
			System.out.printf("enter the number of array element"+i,j);
			a[i][j]=obj.nextInt();
		}}
		for( i=0;i<row;i++) {
			for( j=0;j<col;j++)
      System.out.print(a[i][j]);

}
		System.out.println();
		}}