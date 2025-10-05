package index2;

public class StringBufferExample {
public static void main(String[] args) {
	//string buffer
	System.out.println("output of the string buffer");
	StringBuffer sb=new StringBuffer("eclipse ");
	sb.append("world");
	System.out.println("appended value :" + sb);
	System.out.println(sb.length());
	//insert
	sb.insert(13, " advanced java");
	System.out.println("inserted value :"+sb);
	//delete
	sb.delete(1,3);
	System.out.println("after deletion :" +sb);
	//reverse
	sb.reverse();
	System.out.println("reversed value: " +sb);
	
}
}