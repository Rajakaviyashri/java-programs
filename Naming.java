package selfff;
// camel casing
//class and interface for example here we are creating a
//class with capital letter class-Calc
// variables,methods using in small letter like marks,show()
//constant must be full capital like PIE, BRAND
//if we are combining two letters it should be like showMyMarks()
class C{
	public void show() {
		System.out.println("show C");	}
}
public class Naming {
public static void main(String[] args) {
	new C(); // here we just created a object here there is no reference to call the method so this calls only
	//constructor this is known as anonymous object its disadvantage is we can't  reuse
	// here i can also call like this
	new C().show(); // but i can't use this obj again

}
}
