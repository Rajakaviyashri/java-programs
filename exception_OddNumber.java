package index1;
//write a program to create a method that takes an integer
public class exception_OddNumber {
public static void main(String []args) {
	int n=13;
	trynumber(n);
	int g=8;
	checkEvenNumber(g);
}
public static void trynumber(int n) {
	try {
		checkEvenNumber(n);
		System.out.println(n+ "is even.");
	}catch(IllegalArgumentException e) {
		System.out.println("error:"+e.getMessage());
	}
}
public static void checkEvenNumber(int number) {
	if (number %2!=0) {
		throw new IllegalArgumentException(number+"is odd.");
	}
}
}
