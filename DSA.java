package selff2;
// dsa is used to organize and  storing the data in efficient way
//creating a own data type is known as data 
public class DSA {
public static void main(String[] args) {
	int nums[]= {13,24,56,79,86,90};
	int target =90;
	
	int result = LinearSearch(nums,target);
	int result1 = BinarySearch(nums,target);
	if(result != -1) {
	System.out.println("element found at the index "+ ": " + result);}
	else {
		System.out.println("element not found");
	}
}

public static int LinearSearch(int[] nums, int target) {
	for (int i=0;i<nums.length;i++) 
	{
		if( nums[i] == target)
			return i;
	}
	return -1;
}
public static int BinarySearch(int[] nums, int target) {
	
	int left =0;
	int right =nums.length-1;
	while(left <=right) {
		int mid =( left + right)/2;
		if(nums[mid]== target) {
			return mid;
			
		}
		else if (nums [mid] < target) {
			left =mid +1;
		}
		else{
			right =mid-1;
		}
	}
			return -1;
}
}
