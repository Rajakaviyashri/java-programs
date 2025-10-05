package navinutube;

class Mobile{
	String brand;
	int price;
	 static String name;
	 static {
		name="phone"; 
		System.out.println("static");
	 }

public void show() {
	System.out.println("brand :" + brand + "price :" +price + "name :"+name);
}}
public class Constructor {
public static void main(String[] args) {
	Mobile mob= new Mobile();
mob.brand ="vivo";
	mob.price =12000;
	mob.name="smart phone";

	
    Mobile mob2=new Mobile();
	mob.show();
	mob2.show();
    
			}
   
}
