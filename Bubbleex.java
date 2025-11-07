package selff2;

public class Bubbleex {
public static void main(String[] args) {
	int nums[]= {6,5,4,8,9};
	int size=nums.length;
	int temp =0;
	
	
	System.out.println("before swapping");
	for(int num:nums) {
	System.out.print( num+ "");	
	}
	
	for(int i=0;i<size;i++) {
		for(int j=0;j<size-i-1;j++) {
			if(nums[j] >nums[j+1]) {
				temp=nums[j];
				nums[j]=nums[j+1];
				nums[j+1]=temp;
			}
		}
		System.out.println();
		for(int num:nums) {
		System.out.print( num+ " ");	
		}
	}
	System.out.println();
	System.out.println("after swapping");
	for(int num:nums) {
	System.out.print( num+ " ");	
	}
	
}
}
