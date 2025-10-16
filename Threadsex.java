package selfff;
class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThreadEx extends Thread{
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}

public class Threadsex {
public static void main(String[] args) {
	MyThread obj =new MyThread();
	MyThreadEx obj1 = new MyThreadEx();
	
	obj1.setPriority(Thread.MAX_PRIORITY);// the output will be same we are just suggesting the schedular to give the max,min,norm 
	//priority
	
	obj.start();
	obj1.start();
}
}
