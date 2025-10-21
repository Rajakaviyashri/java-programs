package selfff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Students implements Comparable<Students>{
	int age;
	String name;
	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "students [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Students that) {
		if (this.age > that.age)
			return 1;
		else 
			return -1;
	}

	}

public class ComparativeString {
public static void main(String [] args) {
	Comparator <Students> com =new Comparator<Students>() {
		public int compare (Students i,Students j) {
			if (i.age > j.age)
				return 1;
			else 
				return -1;
			
		}
	};
	List<Students> studs =new ArrayList<Students>();
	studs.add(new Students(21,"sanjana"));
	studs.add(new Students(14,"who"));
	studs.add(new Students(22,"kaviya"));
	studs.add(new Students(32,"why"));
	Collections.sort(studs);
	for(Students s:studs)
	System.out.println(s);
	
}
}
