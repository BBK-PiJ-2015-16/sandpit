import java.util.Scanner;public class Hanoi { public static void main(String[] args) {
            //base case when n=1, m=1

            System.out.print("Please enter the number disks in your Hanoi tower: ");
        double n = readInt();
        System.out.println("You will need " + hanoi(n) + " moves to complete the problem");
    }

    private static double hanoi(double n) {
        if (n==1) {
            return 1;
        } else {
            double m = ((hanoi(n-1))*2) + 1;
            return m;
        }
    }

    private static Scanner __input = new Scanner(System.in);

    public static String readLine()  { return __input.nextLine(); }

    public static int    readInt()   { return Integer.parseInt(readLine());  }

    public static double readdouble(){ return Double.parseDouble(readLine());}

}