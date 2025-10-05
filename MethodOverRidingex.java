package navinutube;
class Calc1{
	public int add(int n1, int n2) {
		return n1+n2;
	}
}
	class AdvCalc1 extends Calc1{
		public int add(int n1,int n2) {
			return n1+n2+2;
		}
}
public class MethodOverRidingex {
public static void main(String[] args) {
	AdvCalc1 obj=new AdvCalc1();
	int r1= obj.add(3, 4);
	System.out.println(r1);
	//here it prints the b class instead of A class this is known as overriding
}
}
