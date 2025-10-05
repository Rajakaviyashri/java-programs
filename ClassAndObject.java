package navinutube;
//we can create multiple classes but to print the elements we should call in main class
class Calculator{
	//public means i can access from anywhere and void means i dont want anything in return i need its performance
 public int add(int n1,int n2){
	 System.out.println("after add");
	 int r=n1+n2;
	 return r;
 }
}
public class ClassAndObject {
public static void main(String[] args) {
	int num1=4;
	int num2=5;
	//here i am mentioning that i have created a new classes so i am creating object for the class
	Calculator calc=new Calculator();//created the object
    int result=calc.add(4,5);//here we are using reference and adding the value
    System.out.println(result);
}
}
