package selfff;

import java.util.*;

public class IteratorEx {
public static void main(String[] args) {
	Collection <Integer> num= new HashSet<Integer>();
	num.add(34);
	num.add(43);
	num.add(45);
	num.add(75);
	num.add(75);
	
	Iterator<Integer> values = num.iterator();
	while(values.hasNext()) {
		System.out.println(values.next());
	}
	
	
}
}
