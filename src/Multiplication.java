import java.util.Scanner;


// 2 -> print multiplication table of any number n up to 10 times.

public class Multiplication {
    public static void main(String[] args){
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();
        int j = 1;
        int ans = 0;
        for (int i = n; j<= 10; j++){
            ans = i*j;
            System.out.println(  n + " * " + j + " = " +ans);
        }
    }
}


