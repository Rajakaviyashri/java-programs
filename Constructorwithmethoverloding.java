package navinutube;
class People{
		private	int age;
		 private String name;
		//constructor without parameters
		public People() {
			age=21;
			name="sanjana";
		}
		//constructor with parameters
		public People(int a,String n) {
			age=a;
			name=n;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
	}

public class Constructorwithmethoverloding {
public static void main(String [] args) {
	People hum=new People();
	People hum1=new People(17,"kaviya");
	System.out.println("age :" +hum1.getAge() +"name: " +hum1.getName());
	System.out.println("age :" +hum.getAge() +"name: " +hum.getName());
	
}
}
