import java.util.Scanner;public class Paper { public static void main(String[] args) {
            //Is it okay to error check the input before the method or should this be done in the method?

            System.out.println("Please enter the paper size you would like:");
        String paper = readLine();
        System.out.print("Width of paper is " + paperSize(paper) + ", width is " + Math.round(paperSize(paper)*1.41379310));
    }

    private static int paperSize(String paper) {
        //always returns width

        if (paper.equals("A0")) { return 841;
        }
        if (paper.equals("A1")) { return 594;
        }
        if(paper.charAt(1) == '0') {
            if (paper.equals("A00")) {
                paper = "A1";
            } else {
                paper = paper.substring(0,paper.length()-2);
            }
            return paperSize(paper)*2;
        }
        int paperNum = Integer.parseInt(paper.substring(1))-2;	
	paper = paper.substring(0,1) + paperNum;
        return paperSize(paper)/2;
    }

    private static Scanner __input = new Scanner(System.in);

    public static String readLine()  { return __input.nextLine(); }

    public static int    readInt()   { return Integer.parseInt(readLine());  }

    public static double readdouble(){ return Double.parseDouble(readLine());}

}