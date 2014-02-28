package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		int i,temp;
    	boolean cont = true;
    	while (cont){
    		cont = false;
    		for (i=0;i<array.length-1;i++){
    			if (array[i]>array[i+1]){
        			temp = array[i];
        			array[i]=array[i+1];
        			array[i+1]=temp;
        			cont = true;
        		}
    		}
    		
    	}

        return unsortedArray;
	}
}
