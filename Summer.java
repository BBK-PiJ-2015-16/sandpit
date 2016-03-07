import java.util.Scanner;public class Summer { public static void main(String[] args) {
        System.out.println(summer(5));
    }

    private static int summer(int n) {
        if (n<=1) {
            return 1;
        } else {
            return n + summer(n-1);
        }
    }

    private static Scanner __input = new Scanner(System.in);

    public static String readLine()  { return __input.nextLine(); }

    public static int    readInt()   { return Integer.parseInt(readLine());  }

    public static double readdouble(){ return Double.parseDouble(readLine());}

}