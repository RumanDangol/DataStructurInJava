package dataStructure;

public class BinarySearch {
	
	int binarySearch(int array[], int l, int r, int x) {
		if(r>=l) {
			int mid = l + (r - l)/2;
			
			if(array[mid] == x) {
				return mid;
			}
			if(array[mid] > x) {
				return binarySearch(array, l, mid-1, x);
			}
			return binarySearch(array, mid+1, r, x);
		}
		return -1;
	}
	public static int[] populateA(int[] B) {
		for(int i=0;i<B.length;i++) {
			B[i] = (int) (Math.random()*100);
		}
		return B;
	}

	static void printArray(int array[]) {
		int n = array.length;
		for(int  i= 0; i<n; ++i) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		
		/**
		 * Using merge sort for binary search
		 * 
		 * 
		 */
		int A[] = new int[100000];
		populateA(A);
		
		
		long startTime = System.currentTimeMillis();
		System.out.println("Start Time For Merge Sort and binary Search : " + startTime);
		
		A = MergeSort.mergeSort(A);
		
		System.out.println("Array list : ");
		printArray(A);
		
		BinarySearch ob = new BinarySearch();
		int n = A.length;
		
		/**
		 * x is the value to be searched
		 */
		int x = 1;
		int result = ob.binarySearch(A, 0, n-1, x);
	
		if(result == -1) {
			System.out.println("Element not found or present");
			
		}else {
			System.out.println("Element found at index "+ result);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("End Time For Merge Sort and binary Search : " + endTime);
		
		long executionTimeMergeAndBinary = (endTime - startTime) ;
		System.out.println("Execution  Time For Merge Sort and binary Search : " + executionTimeMergeAndBinary);
		
		System.out.println();
		System.out.println();
		
		/**
		 * 
		 * use of QuickSort for the Binary Search
		 * 
		 */

		int B[] = new int[10000];
		populateA(B);
		int n1 = B.length;
		
		long startTime1 = System.currentTimeMillis();
		System.out.println("Start Time For Quick Sort and binary Search : " + startTime1);
		
		QuickSort quickSorting = new QuickSort();
		quickSorting.sort(B, 0, n1-1);
		
		System.out.println("Array list : ");
		printArray(B);
		
		BinarySearch ob1 = new BinarySearch();
		
		
		/**
		 * x is the value to be searched
		 */
		int x1 = 1;
		int result1 = ob1.binarySearch(A, 0, n-1, x1);
	
		if(result1 == -1) {
			System.out.println("Element not found or present");
			
		}else {
			System.out.println("Element found at index "+ result);
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("End Time For Quick Sort and binary Search : " + endTime1);
		
		long executionTimeQuickAndBinary = (endTime1 - startTime1) ;
		System.out.println("Execution  Time For Quick Sort and binary Search : " + executionTimeQuickAndBinary);
	}

}
