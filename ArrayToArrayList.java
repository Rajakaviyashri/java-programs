package index2;
 import java.util.*;
import java.util.Arrays;

public class ArrayToArrayList {
public static void main(String[]args) {
	Integer[]arr1= {1,2,3,4,5};
	Integer[] arr2= {3,5,6,7,8};
	//convert array into arraylist
	List<Integer> list1=new ArrayList<>(Arrays.asList(arr1));
	List<Integer> list2=new ArrayList<>(Arrays.asList(arr2));
	//common element
	List<Integer> common=new ArrayList<>(list1);
	common.retainAll(list2);
	System.out.println("common element" +common);
	
	//uncommon element
	List<Integer> uncommon=new ArrayList<>(list1);
	for(Integer num:list1) {
		if(!list2.contains(num)) {
			uncommon.add(num);
		}
			}
	for(Integer num:list2) {
		if(!list1.contains(num)) {
			uncommon.add(num);
		}
	}
	System.out.println("uncommon element" +uncommon);
		}

}


