package index2;

public class StringBufferExample {
public static void main(String[] args) {
	//string buffer
	System.out.println("output of the string buffer");
	StringBuffer sb=new StringBuffer("java ");
	sb.append("world");
	System.out.println("appended value :" + sb);
	//insert
	sb.insert(1, "advanced java");
	System.out.println("inserted value :"+sb);
	//delete
	sb.delete(1,5);
	System.out.println("after deletion :" +sb);
	//reverse
	sb.reverse();
	System.out.println("reversed value: " +sb);
	
}
}