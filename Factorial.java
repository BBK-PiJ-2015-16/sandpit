import java.util.Scanner;public class Factorial { public static void main(String[] args) {
        System.out.println("************RECURSION****************\n");
        System.out.println("Enter the factorial you would like:");
        int n = readInt();
        System.out.println(n + " factorial is " + factorial(n));
        System.out.println("************ITERATION****************\n");
        System.out.println("Enter the factorial you would like:");
        n = readInt();
        System.out.println(n + " factorial is " + factorialIterative(n));
    }

    private static int factorial(int n) {
        if (n<=1) { return 1;
        }
        return n * factorial(n-1);
    }

    private static int factorialIterative (int n){
        if(n<=1) { return 1;
        }
        int result = n;
        for (int count = n-1; count > 1;count--) {
            result = result * count;
        }
        return result;
    }

    private static Scanner __input = new Scanner(System.in);

    public static String readLine()  { return __input.nextLine(); }

    public static int    readInt()   { return Integer.parseInt(readLine());  }

    public static double readdouble(){ return Double.parseDouble(readLine());}

}