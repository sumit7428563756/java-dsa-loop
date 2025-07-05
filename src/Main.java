import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner N = new Scanner(System.in);
       int n = N.nextInt();
       int  sum = 0;
      for (int i = 1; i <= n; i++){
          sum += i;
      }
      System.out.println("Sum of "+ n +" is :- " +sum);
    }
}


