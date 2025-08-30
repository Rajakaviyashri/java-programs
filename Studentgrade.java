package selfwork;
import java.util.Scanner;
public class Studentgrade {
public static void main(String args[]) {
 Scanner obj=new Scanner(System.in);
 System.out.println("enter marks:");
 int marks=obj.nextInt();
 
 if(marks >90) {
	 System.out.println("O");
	 }
 else if(marks>80) {
	 System.out.println("A");
 }
 else if(marks>70) {
	 System.out.println("B");
 }
 else if (marks>60) {
	 System.out.println("C");
 }
 else {
	 System.out.println("fail");
 }
}
}
