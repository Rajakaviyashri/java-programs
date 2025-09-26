package index2;
import java.util.*;
public class LeftStarPattern {
public static void main(String [] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number of row: " );
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		//throws the cursor to the next line
		System.out.println();
	}
}
}
