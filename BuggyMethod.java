import java.util.Scanner;public class BuggyMethod { public static void main(String[] args) {
        System.out.println("Please enter a number here:");
        int n = readInt();
        System.out.println("The result is " + buggyMethod(n));
    }

    private static String buggyMethod(int n) {
        if(n<=0) {
            return "";
        }
        return n + " " + buggyMethod(n-2);
    }

    private static Scanner __input = new Scanner(System.in);

    public static String readLine()  { return __input.nextLine(); }

    public static int    readInt()   { return Integer.parseInt(readLine());  }

    public static double readdouble(){ return Double.parseDouble(readLine());}

}