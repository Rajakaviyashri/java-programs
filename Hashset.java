package index2;
import java.util.*;
//HashSet is a part of java collection framework and is used to store unique elements
//stores in hashSet table
//it comes under interface 
//it does not maintain any order
//no duplicate elements are allowed
//one null element
//insertion deletion will be faster
//it is non synchronized not a thread safe but its faster than synchronized 
public class Hashset {
public static void main (String[] args) {
	//creating a hash set of strings
	HashSet<String> fruits= new HashSet<>();
	
	//adding elements
	fruits.add("apple");
	fruits.add("banana");
	fruits.add("mango");
	fruits.add("apple");//duplicate will be ignored
	
	//displaying the elements
	System.out.println("fruits: " +fruits);
	
	//checking if an element exists
	System.out.println(":contains mango?" +fruits.contains("mango"));
	
	//remove the element
	fruits.remove("banana");
	
	//iterating through hashSet
	System.out.println("iterating hashset:");
	for(String fruit: fruits) {
		System.out.println(fruit);
	}
	//size of the hashSet
	System.out.println("total fruits:"+ fruits.size());
	//clearing all elements
	fruits.clear();
	System.out.println("is the basket is empty :" + fruits.isEmpty()); 
	
}
}
