package index1;
import java.util.Scanner;
public class excercise2 {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int x,y;// operands
	System.out.println("enter the first name(x)");
	x= obj.nextInt();
	System.out.println("enter the second name(y)");
	y=obj.nextInt();
	System.out.println(x>y);//greater than
	System.out.println(x<y);//lesser than
    System.out.println(x==y);// equal to
    System.out.println(x!=y); //not equal to
    System.out.println(x>=y);// greater than equal to
    System.out.println(x<=y); // lesser than equal to
}
}
