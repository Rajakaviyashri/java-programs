package selfff;

public class Wrapper {
public static void main(String[] args) {
	int num =16;
	Integer num1=8;
	// here we are taking the primitive value and storing in a object. this concept is known as boxing.
	//int num =16;
	//Integer num1=num; // here i am calling num so this automatically call the primitive data so this known as auto boxing
	
	int num2 = num1.intValue();// here i am geting this value from the object this is known as auto unboxing.
	System.out.println(num2);
	String str="12";
	int num3= Integer.parseInt(str);// here using parse we can convert the String value unto int.
	System.out.println(num3*2);
}
}
