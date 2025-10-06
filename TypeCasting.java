package selfff;
class H{
	public void show1(){
		System.out.println("in H show");
	}
}
class J extends H{
	public void show2() {
		System.out.println("in J show");
	}
}
public class TypeCasting {
public static void main(String[] args) {
	H obj = (H)new J();// here (H) implicits behind the scene so we don't need to mention here and that is known as upcasting
	obj.show1();
	
	J obj1 = (J) obj; // here this is known as down casting
	obj1.show2();
	// here upcast and down cast is known as type casting
}

}
//double d= 4.5;
//int i=(int) d;// this is known as type casting it change the primitive types

//System.out.println(i);