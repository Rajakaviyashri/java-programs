package navinutube;
//it means that like a capsule because it made with closer and tight so the medicine can not go outside
//example: human:if some one asking about your details like name email id name is okay but asking about your personal is not okay 
//to share first we should decide whether we should share or not
 class Human{
	private int age;
	private String name;
	//it is private so we are using getAge for asking the information which we cant access
	// to get the age using getAge
	public int getAge() {
		return age;
	}
	//for assigning the value using setAge
	public void setAge(int age) {
		this.age=age;
		// this keyword represents the correct object
		// we dono which is instance variable which is local variable so
		// mentioning here the word this is which the age or variable
		//is not a local variable it is instance variable
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}

public class Encapsulation {
public static void main(String[] args) {
	
Human hu=new Human();
// if we are printing before assigning the value the values will be 0 or null
//System.out.println(hu.getAge()+ ":" +hu.getName());
   hu.setAge(30);      
   hu.setName("sanjana ");
//here also we should call getAge and getName to print the output
System.out.println(hu.getAge()+ ":" +hu.getName());
}
}