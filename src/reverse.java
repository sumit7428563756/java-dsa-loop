import java.util.Scanner;

// print all numbers from n to 1 in reverse order using a loop.
public class reverse {
    public static void main(String[] args){
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();
        for (int i = n; i >=1 ; i--){
            System.out.println(i);
        }
    }
}

//Time Complexity = O(n)
//space Complexity = O(1)
