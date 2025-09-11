package index1;
//method returns value
//void null
//in.double retuns0
public class Methodusingskeleton {
public int subNumbers(int x, int y)//it is paramater
{
	int subract=x-y;
	//returns a value
	return subract;
	}
public static void main(String args[]) {
	int num1=50,num2=30;
	 Methodusingskeleton obj=new  Methodusingskeleton();
	 //calling the method
	 int outcome=obj.subNumbers(num1,num2);
	 System.out.println("the result is"+outcome);
}
}
