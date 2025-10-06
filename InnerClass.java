package selfff;
class Out{
	
	public void show() {
		System.out.println("in show");
	}
class In{
	public void display() {
		System.out.println("in display");
	}
}
}
public class InnerClass {
public static void main(String[] args) {
	Out obj=new Out();
	obj.show();
	
	Out.In obj1=obj.new In();//if the inner class is static we should do this as out.in bj1 =new out.in
	obj1.display();
}
}
