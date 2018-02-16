package dataStructure;

public class ArrayStructures {
	
	//contains 50 boxes
	private int[] theArray = new int[50];
	//arraySize helps to only display which has values
	private int arraySize = 10;
	public void generateRandomArray() {
		/**
		 * random number between 10 and 19 in array
		 */
		for(int i=0; i <arraySize; i++) {
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}
	public void printArray() {
		System.out.println("----------------");
		for(int i =0; i<arraySize; i++) {
			System.out.print("| "+i + "|");
			System.out.println(theArray[i]+ " |");
			System.out.println("--------------------------");
		}
	}
	public int getValueAtIndex(int index) {
		if(index < arraySize) return theArray[index]; 
		return 0;
	}
	public boolean doesArrayContainThisValue(int searchValue) {
		boolean valueInArray = false;
		for(int i = 0; i < arraySize; i++) {
			if(theArray[i] == searchValue){
				valueInArray = true;
			}
		
		}
		return valueInArray;
	}
	public void deleteIndex(int index) {
		if(index < arraySize){
			for(int i = index; i<(arraySize - 1); i++) {
				theArray[i] = theArray[i+1];
			}
		arraySize--;
		}
	}
	public void insertValue(int value) {
		if(arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
	}
	public String linearSearchForValue(int value) {
		boolean valueInArray = false;
		String indexsWithValue = "";
		System.out.print("The value was found in following : ");
		for(int i=0;i < arraySize; i++) {
			if(theArray[i] == value) {
				valueInArray = true;
				System.out.print(i + " ");
				indexsWithValue+= i +" ";
			}
		}
		if(!valueInArray) {
			 indexsWithValue = "None";
			 System.out.print(indexsWithValue);
			
		}
		System.out.println();
		return  indexsWithValue;
	}
	
	public void bubbleSortAscendingOrder() {
		for(int i = arraySize -1;i>1;i--) {
			for(int j = 0; j<i; j++) {
				
				if(theArray[j] > theArray[j+1]) {
					swapValues(j, j+1);
				}
				
				
				
			}
		}
	}
	public void bubbleSortDecendingOrder() {
		for(int i = arraySize -1;i>1;i--) {
			for(int j = 0; j<i; j++) {
				if(theArray[j] < theArray[j+1]) {
					swapValues(j, j+1);
				}
				
				
			}
		}
	}
	public void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne]= theArray[indexTwo];
		theArray[indexTwo] = temp;
				
	}
	
	public void binarySearchForValue(int value) {
		int lowIndex = 0;
		int highIndex = arraySize -1;
		
		while (lowIndex <= highIndex) {
			int middleIndex = (highIndex + lowIndex)/ 2;
			if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
			else if (theArray[middleIndex] > value) { highIndex = middleIndex -1;}
			else {
				System.out.println("\n Found a Match for "+ value + " at Index "+ middleIndex);
				lowIndex = highIndex +1;
			}
			
			
		}
	}
	
	public void selectionAscendingSort() {
		for(int i = 0; i < arraySize; i++) {
			int minimum = i;
			for(int y = i; y < arraySize; y++) {
				if(theArray[minimum] > theArray[y]) {
					minimum = y;
				}
			}
			swapValues(i, minimum);
		}
		
	}
	public void selectionDecendingSort() {
		for(int i = 0; i < arraySize; i++) {
			int minimum = i;
			for(int y = i; y < arraySize; y++) {
				if(theArray[minimum] < theArray[y]) {
					minimum = y;
				}
			}
			swapValues(i, minimum);
		}
		
	}
	public void insertionAscendingSort() {
		for(int i =1; i<arraySize; i++) {
			int j=1;
			int toInsert = theArray[i];
			while((j> 0 ) && (theArray[j-1] > toInsert)) {
				theArray[j] = theArray[j-1];
				j--;
			}
			theArray[j] = toInsert;
		}
	}
	
	public static void main(String[] args) {
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		newArray.printArray();

	}

}
