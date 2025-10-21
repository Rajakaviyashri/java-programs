package selfff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparativeEx {
public static void main(String[] args) {
	Comparator<Integer> com =new Comparator<Integer>()
	{
		public int compare(Integer i, Integer j) 
		{
		
			if(i%10 >j%10)
				return 1;
			else
				return -1;
		}
	};
	List<Integer> scores= new ArrayList<>();
	
	scores.add(10);
	scores.add(23);
	scores.add(32);
	scores.add(47);
	scores.add(24);
	Collections.sort(scores,com);
	System.out.println(scores);
}
}
