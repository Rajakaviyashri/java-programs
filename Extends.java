package navinutube;
class A{
// create a constructor without parameters
	public A() {
		super();// here using super because parameterized constr8uctor of b will be printed but a's value will not be printed
		//so to print the a parameterized constructor we should use super()
		System.out.println("A");
		}
// creating with parameters	
	public A(int n) {
		super();
		System.out.println("int A");
	}
}

class B extends A
{
	public B() {
		super();
		System.out.println("B");
	}
	public B(int n) {
		this();
		System.out.println("int B");
	}
	}
public class Extends {
public static void main(String[] args) {
	// if i dont pass the value it prints the without parameter values
	//if i pass the value it prints the parameterized value
	B obj=new B(5);
}
}
