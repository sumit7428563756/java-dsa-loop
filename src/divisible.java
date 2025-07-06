import java.util.Scanner;

public class divisible {

    public static void main(String[] args){
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();
        int count = 0;
        for (int i= 1; i<=n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                count++;

            }

        }
        System.out.println(count);
    }
}
