import java.util.Scanner;public class Fibonacci { public static void main(String[] args) {
        System.out.println("************RECURSION****************\n");
        System.out.println("What term of the fibonacci sequence would you like?");
        int n = readInt();
        System.out.println("The "+ n + " term of the fibonacci sequence is " + fibonacci(n));
        System.out.println("************ITERATION****************\n");
        System.out.println("What term of the fibonacci sequence would you like?");
        n = readInt();
        System.out.println("The "+ n + " term of the fibonacci sequence is " + fibonacciIterative(n));
    }

    private static int fibonacci(int n) {
        if(n==1 || n==2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    private static int fibonacciIterative(int n) {
        if (n==1 || n==2) {
            return 1;
        } else {
            int a = 1;
            int b = 1;
            int result = 0;
            while(n>2) {
                result = a + b;
                a = b;
                b = result;
                n--;
            }
            return result;
        }
    }

    private static Scanner __input = new Scanner(System.in);

    public static String readLine()  { return __input.nextLine(); }

    public static int    readInt()   { return Integer.parseInt(readLine());  }

    public static double readdouble(){ return Double.parseDouble(readLine());}

}