import java.util.Scanner;

 // 1 :- write a program to calculate the sum of numbers from 1 to n using a loop?
public class Main {
    public static void main(String[] args) {
        // Scanner for input numbers in terminal
       Scanner N = new Scanner(System.in);
       // make scanner in int value
       int n = N.nextInt();
       int  sum = 0;
       //for loop
      for (int i = 1; i <= n; i++){
          // here sum add next i again and again till n
          sum += i;
      }
      // here println exist of loop so print only one integer not full loop numbers
      System.out.println("Sum of "+ n +" is :- " +sum);
    }
}

// Flow ->
// when user enter n = 5, then i start with 1 and runs till n numbers with adding of next i then
// sum which have value 0 add itself i value then loop end and restart again and it runs till when loop reach n numbers
// so when loop reach n numbers ans add all the next i itself and print the sum of i.

// example ->
// ans = 0, n = 5
// ans = 1+2+3+4+5 = 15;


