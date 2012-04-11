/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;
import java.io.*;
import java.util.*;
/**
 *
 * @author cgmorri1
 */
public class Tmp {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        String fileName = "test_file.txt";
        try {
            BufferedReader reader = 
                new BufferedReader( 
                    new FileReader(fileName) );
            String line = reader.readLine();
            while(line!=null) {
                v.addAll(Arrays.asList((line.split(" "))));
                //System.out.println(line);
                line = reader.readLine();
            }
        }
        catch(Exception e){
            System.out.println("Exceptione is ="+e.getMessage());
        }
        int start = -1,end = -1;
        for( int i = 0; i < v.size(); ++i ) {
            String tmp = v.elementAt(i);
            if( tmp.indexOf("/*") > -1 && start == -1 ) {
                start = i;
                System.out.println("\t/* found.");
            }
            else if( tmp.indexOf("*/") > -1 && start != -1 ) {
                if( tmp.endsWith("*/") ) {
                    v.set(i, v.elementAt(i).substring(0, v.elementAt(i).length()-2));
                    v.subList(start, end).clear();
                }
                else {
                    v.subList(start, end+1).clear();
                }
                end = i;
                System.out.println("\t*/ found.");
                v.subList(start, end).clear();
                start = -1; end = -1;
            }
            System.out.println(tmp);
        }
        System.out.println("=========================");
        for( int i = 0; i < v.size(); ++i ) {
            String tmp = v.elementAt(i);
            System.out.println(tmp);
        }
        System.out.println("=========================");
    }
}

