import java.util.Scanner;

public class FibRecursion {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("How many Fibonacci numbers do you want to output?");
            int n=input.nextInt();
            System.out.println(fib(n));
            for(int i=1;i<=n;i++) {
                System.out.print(fib(i)+" ");
            }
        }

        //Recursive implementation of the Fibonacci sequence method
        public static int fib(int n) {
            if(n==1 || n==2)
                return 1;
            else
                return fib(n-1)+fib(n-2);
        }
    }

