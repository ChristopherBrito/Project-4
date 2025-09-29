import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    int n = 1;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Type how many times you want to print Hello World.");
		n = scnr.nextInt();
		printer(n);
		
		System.out.println("Type in a small number.");
		int n1 = scnr.nextInt();
		System.out.println("Type in a bigger number");
		int n2 = scnr.nextInt();
		
		int sum = sumOfNum(n1, n2);
		System.out.println("The sum of the numbers that are in between n1 and n2," +
		" using multiples of 7 is " + sum);
	}
	
	public static int printer(int n) {
	    if(n == 0) { return n; 
	    }
	    
	    System.out.println("Hello World");
	    return printer(n - 1);
	}
	public static int sumOfNum(int n1, int n2) {
       
        if (n1 > n2) {
            return 0;
        }
        
        if (n1 % 7 == 0) {
            return n1 + sumOfNum(n1 + 1, n2);
        } else {
            return sumOfNum(n1 + 1, n2);
        }
    }
    
}
