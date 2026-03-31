// TODO: Read n (as String or long) and k
// TODO: Calculate the initial sum of digits of n
// TODO: Multiply that sum by k to account for concatenation
// TODO: Find the super digit of the resulting value
// TODO: Print the result
import java.util.Scanner;
public class SuperDigit {
        static Scanner sc = new Scanner(System.in);
        public static long sum(long n){
                long m = 0;
                while(n>0){
                        m += n%10;
                        n /= 10;
                }
                return m;
        }
        public static void main(String[] args) {
                long n = sc.nextLong();
                int k = sc.nextInt();
                n = sum(n) * k;
                while(n>9){
                        n = sum(n);
                }
                System.out.println(n);
        }
}
