import java.util.Scanner;
import java.util.Arrays;
public class BinarySearchEx {
    
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("What is the size of the array");
	int size = scnr.nextInt();
	int[] array = new int[size];
	
	for (int i = 0; i < size; i++) {
            System.out.print("Enter integer for index " + i + ": ");
            array[i] = scnr.nextInt();
	}
	Arrays.sort(array);
	
    System.out.println("What number are you looking for");
    int search = scnr.nextInt();
    int result = binarySearch(search, array);
    if (result != -1){
    System.out.println("The number you searched for is " + search);
    }else {
    System.out.println("The number you searched for is not in the array");    
    }
    
	}
	
	public static int binarySearch(int search, int[] array) {
    int start = 0;
    int end = array.length - 1;
    
    while (start <= end ) {
        int middle = (start + end) / 2;
        
        if (search < array[middle]) {
            end = middle - 1;
        }
        
        if (search > array[middle]) {
            start = middle + 1;
        }
        if (search == array[middle]) {
            return middle;
        }
    }
    return -1;
}
}
