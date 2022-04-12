import java.util.Scanner;

public class FibLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You want to output a few Fibonacci numbers？");
        int n=input.nextInt();
        int x=1;
        int y=1;
        int z=1;
        if(n<=2){
            for(int i=0;i<n;i++) {
                System.out.print(z+" ");
            }
        }
        while(n>2) {
            z=x+y;
            x=y;
            y=z;
            n--;
            System.out.print(z+" ");
        }
    }
}
