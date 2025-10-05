package index2;
import java.util.*;
public class MaxxArr {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=scan.nextInt();
	int[] arr1= new int[size];
	int[] arr2=new int[size];
	//input
	for(int i=0;i<size;i++) {
		System.out.println((i+1)+". element first array");
		int value1=scan.nextInt();
		arr1[i]=value1;
	}
	for (int i=0;i<size;i++) {
		System.out.println((i+1)+". element second array");
		int value2=scan.nextInt();
		arr2[i]=value2;
	}
	//output
	System.out.println("----output----");
	for(int i=0;i<size;i++) {
		System.out.println((arr1[i]+arr2[i])+"");
	}
}
}
