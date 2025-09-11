package index1;
import java.util.*;
public class ArrayReplace {
public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	// size of array
	System.out.println("enter the number of elements: ");
	int n=scanner.nextInt();
	int arr[]=new int[n];
	//read array elements
	System.out.println("enter" + n +"elements");
	for (int i=0;i<n;i++){
		arr[i]=scanner.nextInt();
	}
	//replace
	System.out.println("enter the keyindex(1-2 non indexed) you want to replace");
	int keyreplace=scanner.nextInt();
	
	System.out.println("enter the replacement no");
	int replaceNum=scanner.nextInt();
	for(int i=0; i<arr.length;i++) {
		if (arr[i]==keyreplace) {
			arr[i]=replaceNum;
		}
		}
	System.out.println("updated array");
	for(int number:arr)//for
		System.out.println(number+"");
	}
	
}