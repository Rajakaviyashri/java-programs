package navinutube;
// inheritance
//here we are changing calculator to advanced calculator so we are using extends to connect the normal 
//calculator this is known as inheritance

class Calc{
	public int add(int n1, int n2) {
		return n1 +n2;
	}
	public int sub(int n1 ,int n2) {
		return n1-n2;
	}
}
//here advCalc is a Calc
//child class just extends it
// if we are upgrading for 1 time is known as single inheritance
// the extends for mutli times is known as multiple inheritance
class AdvCalc extends Calc{// advCalc is known as subclass and Calc is known superclass inheritance kywrd is extends
	public int multi(int n1,int n2) {
		return n1*n2;
	}
	public int div(int n1,int n2) {
		return n1/n2;
	}
}
// here we are upgrading the calc for three times this is known as multi level inheritance
class VeryAdvCalc extends AdvCalc{
	public double power(int n1,int n2) {
		return Math.pow(n1, n2);
	}
}
public class Inheritance {
public static void main(String[]args) {
	VeryAdvCalc obj= new VeryAdvCalc();
	int r1=obj.add(3,4);
	int r2=obj.sub(4,5);
	int r3=obj.multi(5,5);
	int r4=obj.div(10,5);
	double r5=obj.power(12,12);
	System.out.println("added value :"+r1+ "sub value :" +r2+ "multiplied value :" 
	+ r3+ "divded value :" +r4 +"power value: " + r5);
}
} 
