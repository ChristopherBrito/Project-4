import java.util.Scanner;//imports the Scanner class
import java.util.Arrays;//imports the Arrays class
public class BinarySearchEx {//This whole thing is problem 3
    
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);//initiates the scanner class
	
	System.out.println("What is the size of the array");//asks the user for the size of the array
	int size = scnr.nextInt();//assigns the size of the array to "size"
	int[] array = new int[size];//creates a new array called array
	
	for (int i = 0; i < size; i++) {//used to add the elements to the arrray
            System.out.print("Enter integer for index " + i + ": ");//tells you what index you are giving a number to
            array[i] = scnr.nextInt();//assigns a value to that index
	}
	Arrays.sort(array);//sorts the array in numerical order
	
    System.out.println("What number are you looking for");//asks the user for the number they are searching for
    int search = scnr.nextInt();//assigns the number they are looking for to search
    int result = binarySearch(search, array);//calls the method and asigns the result of it to "result"
    if (result != -1){//checks to see if result has the number you are looking for
    System.out.println("The number you searched for is " + search);
    }else {//if it doesn't, it will print this message v
    System.out.println("The number you searched for is not in the array");    
    }
    
	}
	
	public static int binarySearch(int search, int[] array) {// this is the method where it does the actual binary search
    int start = 0;//assigns the start variable with int 0
    int end = array.length - 1;// assigns the end variable with the last index
    
    while (start <= end ) {//while loop that keeps going until the number is either found or not in the array
        int middle = (start + end) / 2;// assigns the middle varaible the midddle number in the array
        
        if (search < array[middle]) {//if the search variable is less than the middle var, then assigns the end var to the index of middle -1
            end = middle - 1;
        }
        
        if (search > array[middle]) {//if the search variable is more than the middle var, then assigns the start var to the index of middle +1
            start = middle + 1;
        }
        if (search == array[middle]) {//if the middle variable is the search variable then returns the middle value
            return middle;
        }
    }
    return -1;//stops the while loop from looping again, after the search variable is either found or not in array
}
}
