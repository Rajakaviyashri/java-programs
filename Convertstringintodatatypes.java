package index1;
import java.util.Scanner;

public class Convertstringintodatatypes {

		    public static void main(String[] args) {
		    	
		    Scanner obj=new Scanner(System.in);
		    //1.create numeric string from the user
		    
		    System.out.println("enter the numeric string");
		    String str=obj.nextLine();
		    
		    //2.converting into an int,long,float,double
		    int intValue=Integer.parseInt(str);
		    long longValue=Long.parseLong(str);
		    float floatValue=Float.parseFloat(str);
		    double doubleValue=Double.parseDouble(str);
		    
		    //printing the values
		    System.out.println("int"+intValue);
		    System.out.println("long"+longValue);
		    System.out.println("float"+floatValue);
		    System.out.println("double"+ doubleValue);
		    
		    }}
	       

	