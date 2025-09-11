package index1;
import java.util.*;
public class ComparingArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	                // size of arrays
	                System.out.print("Enter number of elements: ");
	                int n = scanner.nextInt();

	                int arr1[] = new int[n];
	                int arr2[] = new int[n];

	                // read first array
	                System.out.println("Enter elements of first array:");
	                for (int i = 0; i < n; i++) {
	                    arr1[i] = scanner.nextInt();
	                }

	                // read second array
	                System.out.println("Enter elements of second array:");
	                for (int i = 0; i < n; i++) {
	                    arr2[i] = scanner.nextInt();
	                }

	                // check equality
	                boolean isEqual = true;

	                // case 1: direct comparison
	                for (int i = 0; i < n; i++) {
	                    if (arr1[i] != arr2[i]) {
	                        isEqual = false;
	                        break;
	                    }
	                }

	                // case 2: reverse comparison (only if not already equal)
	                if (!isEqual) {
	                    isEqual = true;
	                    for (int i = 0; i < n; i++) {
	                        if (arr1[i] != arr2[n - 1]) {
	                        	isEqual=false;
	                        	break;

	    }
}
	                }
	              //result
	                if(isEqual) {
	                	System.out.println("arrays are equal(direct Or reverse)");
	                }
	                else {
	                	System.out.println("arrays are not equal");
	                }     
	                
	                
	                
	    }
	    
}