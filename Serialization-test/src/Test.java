import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
	private final static String FILENAME = "test.txt";
	public static void main(String[] args) {
		List<Person> lp = new ArrayList<>();
        Person p = new Person(1,"Freddie");
        lp.add(p);
        
        System.out.println("Before: " + lp);
        
        ObjectOutputStream encode = null;
        try {
            encode = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(FILENAME)));
        } catch (FileNotFoundException e) {
            System.err.println("encoding... " + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            encode.writeObject(lp);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            encode.close();
        } catch (IOException ex2) {
            ex2.printStackTrace();
        }
        
        ObjectInputStream d = null;
        try {
            d = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(FILENAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Person> result = null;
        try {
            result = (List<Person>) d.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("After: " + result);
        try {
            d.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
