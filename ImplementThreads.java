package selfff;
class T implements Runnable{
	public void run() {
		for(int i= 0; i<10;i++) {
			System.out.println("hii..");
		}
	}
}
class R implements Runnable{
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("hello");
		}
	}
}
public class ImplementThreads {
public static void main(String[] args) {
	Runnable obj=new T();
	Runnable obj1=new R();
	
	Thread t1 =new Thread(obj);
	Thread t2 =new Thread(obj1);
	
	t1.start();
	t2.start();
}
}
