package index1;

public class casting {
public static void main(String[] args) {
	//widening casting (automatic casting (automatic casting- converting small type into larger type size 
	// byte->short->char->int->long->float->double
	
	
	//narrowing casting (manual casting)-converting larger type size into smaller type
	//double->float->long->int->char->short->byte
	
	
	int myInt=9;
	double myDouble=myInt;//integer
	System.out.println("the value of myint is"+myInt); //automatic or widening casting
	System.out.println("the value of my double is" + myDouble);
	
	double myDouble1=9.78d;
	int myInt1=(int) myDouble1; //mannual casting: double into int
	System.out.println("the value of myint1 is "+ myInt1);
	System.out.println("the value of mydouble is"+ myDouble1);
	
}
}
