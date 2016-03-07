import java.util.Scanner;public class Tree { public static void main(String[] args) {
        Node myNode = new Node();
        int start = 1;
        System.out.println("Enter the number of levels of nodes you would like");
        int num = readInt();
        createNodes(num,myNode);
        setAllValue(myNode, start);
        printAllNodeValues(myNode);
    }

    private static void printAllNodeValues(Node theNode) {
        if(theNode == null) {
            return;
        } else {
            System.out.println(theNode.value);
            printAllNodeValues(theNode.left);
            printAllNodeValues(theNode.right);
        }
    }

    private static void createNodes(int n,Node theNode) {
        if(n==1) {
            return;
        } else {
            theNode.makeLeft();
            theNode.makeRight();
            createNodes(n-1,theNode.left);
            createNodes(n-1,theNode.right);
        }
    }

    private static void setAllValue (Node n,int v) {
        if (n == null) {
            return;
        }
        n.value = v;
        setAllValue(n.left,v+1);
        setAllValue(n.right,v+1);
    }
    static class Node {
        int value;
        void makeLeft () {
            this.left = new Node();
        }
        void makeRight () {
            this.right = new Node();
        }
        Node left;
        Node right;
    }

    private static Scanner __input = new Scanner(System.in);

    public static String readLine()  { return __input.nextLine(); }

    public static int    readInt()   { return Integer.parseInt(readLine());  }

    public static double readdouble(){ return Double.parseDouble(readLine());}

}