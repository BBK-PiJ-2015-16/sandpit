import java.util.Scanner;public class Papertesty { public static void main(String[] args) {
        System.out.println(Math.round(smallerPaper(1))+ ", " + Math.round(smallerPaper(1)/Math.sqrt(2)));
    }

    private static double smallerPaper (int n) {
        double height = 1189;
        if(n == 0) {
            return height;
        }
        return smallerPaper(n-1) /  Math.sqrt(2);
    }

    private static Scanner __input = new Scanner(System.in);

    public static String readLine()  { return __input.nextLine(); }

    public static int    readInt()   { return Integer.parseInt(readLine());  }

    public static double readdouble(){ return Double.parseDouble(readLine());}

}