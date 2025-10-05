package navinutube;
 //final 
class Calc2{
	public final void show() {
		System.out.println("in Calc show");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
//here any one can extends the advcalc any one can use my calc so we should call the class as final so 
//none of them can extends the class
//class AdvCalc extends Calc2{
//	public void show() { // here it shows error because iam using final in method so here the over ride stops
	//System.out.println("in extends");
//}}
public class FinalClass {
public static void main(String[] args) {
	Calc2 obj=new Calc2();
	obj.show();
	obj.add(6, 3);
}
}
