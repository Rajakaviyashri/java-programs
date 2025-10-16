package selfff;
public class Throwex {
	
	public static void main(String[] args) {
		int i=20;
		int j= 0;
		
		try {
			j =18/i;
			if(j==0) throw new ArithmeticException("i dont want");
		}
		catch(ArithmeticException e) {
			j=18/1;
			System.out.println("default output is");
		}
		catch(Exception e) {
			System.out.println("something went wrong");
		}
		System.out.println(j);
		}
	}


