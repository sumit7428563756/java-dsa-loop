import java.util.Scanner;

//print the factional of a number n
  //solution = n = 6 the (6*5*4*3*2*1 = 720)
 public class factional {
    public static void main(String[] args){
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();
        int count = 1;
        for (int i = n; i >=1; i--){
            count = count*=i;
            System.out.println(i + " * ");
        }
        System.out.println(count);
    }
}
