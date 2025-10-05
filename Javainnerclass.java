package index2;
/*java inner class
 * In java,i is also possible to nest classes (a class within a class).
 * the purpose of nested classes is to group classes that belong together,whic makes your code more readable and maintainable

to access the inner class, create an object of the outer create class,
and then create an object of the inner class
 */
class OuterClass{
	int x=10;
	class InnerClass//2nd class--Inner class
	{
		int y=5;
	}
}//--outer class closes here
public class Javainnerclass {
	public static void main(String[] args) {
		OuterClass myOuter=new OuterClass();
		//outerclassname.Innerclassname Inner classobject=outerClassobject.new Innerclassname
		OuterClass.InnerClass myInner=myOuter.new InnerClass();
		System.out.println(myInner.y+ myOuter.x);
	}

}
