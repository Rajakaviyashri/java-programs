package navinutube;
abstract class Car{
	// explanation time 7.56.26
	public abstract void drive();
	public abstract void fly();
	public void playMusic()
	{
		System.out.println("play music");
	}	
}
// here we are implementing we are written public abstract and declaring the value so here we are defining the value
class Bmw extends Car{
	public void drive() {
		System.out.println("driving....");
	}
	public void fly() {
		
		System.out.println("flying");
	}
}
public class AbstractClass {
public static void main(String[] args) {
	Car obj=new Bmw();
	obj.drive();
	obj.playMusic();
	obj.fly();
}
}
