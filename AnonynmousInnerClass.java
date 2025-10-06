package selfff;
class K{
	public void show() {
		System.out.println("in K show");
	}
}
public class AnonynmousInnerClass {
public static void main(String[] args) {
	K obj =new K()
			{
		public void show() {
			System.out.println("In new show"); // running in public class is known as anonymous inner class 
		}
			};
	obj.show();
}
}
