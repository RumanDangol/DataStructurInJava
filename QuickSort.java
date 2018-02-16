package dataStructure;

public class QuickSort {
	
	int partition(int array[], int low, int high) {
		int pivot = array[high];
		int i=(low-1);//index of smaller element
		for(int j=low; j<high; j++) {
			//if current element is smaller than or equal to pivot
			if(array[j]<=pivot) {
				i++;
				
				//swap array[i] and array[j]
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		//swap array[i+1] and array [high] 
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i+1;
	}

	/**
	 * 
	 * the main function that implements quickSort
	 * array[] - Array to be sorted
	 * low - starting index
	 * high - ending index
	 * 	 
	 * 
	 * 
	 */
	void sort(int array[],int low, int high) {
		if(low<high) {
			/**
			 * pi is partitioning index
			 */
			int pi = partition(array, low, high);
			
			/**
			 * recursively sort elements before partition and after partition
			 */
			sort(array, low, pi-1);
			sort(array, pi+1, high);
		}
	}
	static void printArray(int array[]) {
		int n = array.length;
		for(int  i= 0; i<n; ++i) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
		
	}
	public static int[] populateA(int[] B) {
		for(int i=0;i<B.length;i++) {
			B[i] = (int) (Math.random()*100);
		}
		return B;
	}
	public static void main(String[] args) {
		
		int A[] = new int[10000];
		populateA(A);
		
		System.out.println("Before Sorting");
		printArray(A);
		int n = A.length -1 ;
		
		long startDate = System.currentTimeMillis();
		System.out.println(startDate);
		
		QuickSort ob = new QuickSort();
		ob.sort(A, 0, n);
		
		long endDate = System.currentTimeMillis();
		System.out.println(endDate);
		
		System.out.println("After quick Sorting");
		printArray(A);
	}

}
