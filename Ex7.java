package emc;
import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num1=obj.nextInt();
		int num2= obj.nextInt();
		
		if(num1==num2) {
			System.out.println("it is equal");
		}
		else {
			System.out.println("it is not equal");
		}
	}
}
