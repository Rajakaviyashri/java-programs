package selfff;
class Demo{
	public void show() throws ClassNotFoundException{
		Class.forName("Calc");
	}
}
public class Throwsex {
public static void main(String[] args)  {
	Demo obj =new Demo();
	try {
		obj.show();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
