package selfff;
class Computer2{
	public void show() {

	}}
class Laptop2 extends Computer2{
	public void show() {
		System.out.println("code,compile,run");
	}}
	class Desktop extends Computer2{
		public void show() {
			System.out.println("code,compile,run,Faster");
		}}
	class Developer {
		public void show(Computer2 lap) {
			lap.show();
		}
	}	

public class Interface {
public static void main(String[] args) {
	Computer2 com =new Computer2();
	Computer2 lap=new Laptop2();
	Computer2 desk =new Desktop();
	Developer dev=new Developer();
	dev.show(desk);
}
}
