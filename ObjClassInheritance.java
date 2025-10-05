package navinutube;
class Laptop1{
	 String model;
	 int price;
	 public String toString() {
		 return model + ":" +price;
	 }
	 public boolean equals(Laptop1 that) {
		 return this.model.equals(that.model)&& this.price==that.price ;
			 
		 }
	 
}
public class ObjClassInheritance {
public static void main(String[] args) {
	Laptop1 obj=new Laptop1();
	obj.model="lenova";
	obj.price=1000;
	
	Laptop1 obj1=new Laptop1();
	obj1.model="lenova";
	obj1.price=1000;
	boolean result=obj.equals(obj1);
	
	System.out.println(result);// whenever i call the obj the behind the scene it calls the to string
}
}
