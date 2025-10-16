package selfff;

public class ExceptionWithMulltiCatch {
public static void main(String[] args) {
	int i =2;
	int j=0;
	String str=null;
	
	int nums[] =new int[5];
	try {
	j=8/i;
	System.out.println(str.length());
	System.out.println(nums[0]);
	System.out.println(nums[5]);
	
	}
	catch(ArithmeticException e) {
		System.out.println("cannot divide it by zero");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("stay in your limit");
	}
	catch(Exception e) {
		System.out.println("something went wrong");// if i have not handling any exception it print the default exception
	}
	
	System.out.println(j);
	System.out.println("hello");
	
}
}
