package pkg360;

import java.io.*;

/**
 * @author Caleb Morris
 */
public class OutputTest {
    public void init() {
        try {
            PrintWriter out = new PrintWriter(
                new FileWriter("output_test.txt"));
            out.print("Hello ");
            out.println("world");
            out.close();
        }
        catch( Exception e ) {
            System.out.println("Exceptione is ="+e.getMessage());
        }
    }
}
