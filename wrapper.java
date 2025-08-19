package index1;
//byte  //byte
//long  // long
//short //short
//double //double
//boolean //boolean
//float //float
//int  //integer
// it is used to convert all primitive data type into 
//its corresponding wrapper objects(thru class) and vice-versa
public class wrapper {
public static void main(String[] args) {
	byte b=10;
	short s=20;
	int i=30;
	long l=40;
	float f=50.0F;
	double d=60.0D;
	
	char c='a';
	boolean b2=true;
	
	
	
	//autoboxing:converting primitive datatypes into objects
	Byte byteobj=b;//creating object for particular var
	Short shortobj=s;
	Integer intobj=i;
	Long longobj=l;
	Float floatobj=f;
	Double doubleobj=d;
	Character charobj=c;
	Boolean boolobj=b2;
	
	//printing data types
	System.out.println("printing object values");
	System.out.println("Byte object"+byteobj);
	System.out.println("Short object"+shortobj);
	System.out.println("Integer object" +intobj);
	System.out.println("long object" + longobj);
	System.out.println("float object"+ floatobj);
	System.out.println("double object" + doubleobj);
	System.out.println("character object"+ charobj);
	System.out.println("boolean object" + boolobj);
	
	
	//unboxing : converting objects to primitive data types
	
	byte bytevalue=byteobj;
	short shortvalue=shortobj;
	int intvalue=intobj;
	long longvalue=longobj;
	float floatvalue=floatobj;
	double doublevalue=doubleobj;
	char charvalue=charobj;
	boolean booleanvalue=boolobj;
	
	
//printing primitives
	
	System.out.println("printing primitive values");
	System.out.println("byte value:"+ bytevalue);
	System.out.println("short value:" +shortvalue);
	System.out.println("int value :"+ intvalue);
	System.out.println("long value :" + longvalue);
	System.out.println("float value:" + floatvalue);
	System.out.println("double value:"+ doublevalue);
	System.out.println("char value:" + charvalue);
	System.out.println("booleanvalue:"+ booleanvalue);
}
}