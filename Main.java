import java.util.Scanner;//imports the scanner class in java

public class Main {
    
	public static void main(String[] args) {
	    int n = 1;// assigns n with 1 just in case
		Scanner scnr = new Scanner(System.in);//initiates the scanner
		System.out.println("Type how many times you want to print Hello World.");//asks the user a question
		n = scnr.nextInt();//n is how many times it would print hello, taken from user input
		printer(n);//calls the first method
		//This is part of problem 1 ^
		
		//this is part of problem 2 v
		System.out.println("Type in a small number.");//asks the user for what the small number between n1 and n2 will be
		int n1 = scnr.nextInt();//asigns n1 with the next user input
		System.out.println("Type in a bigger number");//asks user for the bigger number bettween n1 and n2, if it is smaller than n1, the code wont work
		int n2 = scnr.nextInt();//assigns n2 with the next user input
		
		int sum = sumOfNum(n1, n2);//calls the method
		System.out.println("The sum of the numbers that are in between n1 and n2," +
		" using multiples of 7 is " + sum);//prints the final result
	}
	
	public static int printer(int n) {// this is problem 1, recursion of printing hello world
	    if(n == 0) { return n; //base case, stops from infinitly looping
	    }
	    
	    System.out.println("Hello World");//prints hello world
	    return printer(n - 1);//returns hello world and keeps on repeating until base case is true
	}
	public static int sumOfNum(int n1, int n2) {//problem 2, recursion of the sum off all numbers divisable by 7 between 2 numbers, 
       
        if (n1 > n2) {//base case, stops from infinitly looping
            return 0;
        }
        
        if (n1 % 7 == 0) {//another base case, checks to see if n1 is divisible by 7
            return n1 + sumOfNum(n1 + 1, n2);//if true, would execute this code
        } else {
            return sumOfNum(n1 + 1, n2);//if false would execute this code
        }
    }
    
}

