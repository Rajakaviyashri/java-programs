package index1;

public class MethodOverLoading {

		public void display() {
			System.out.println("Method with no parameter");
		}
		public void display(int a) {
			System.out.println("Method with parameter" + a);
		}
		
		public static void main (String[] args) {
			MethodOverLoading obj = new MethodOverLoading();
			obj.display();
			obj.display(22);
		}
	}

