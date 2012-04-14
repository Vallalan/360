package pkg360;
import java.io.*;
import java.util.*;
/*
 * @author Caleb Morris
 */
public class InputTest {
    public void main() {
        Vector<String> v = new Vector<String>();
        String fileName = "test_file.txt";
        try {
            BufferedReader reader = 
                new BufferedReader( 
                    new FileReader(fileName) );
            String line = reader.readLine();
            while(line!=null) {
                v.addAll(Arrays.asList((line.split(" "))));
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch(Exception e){
            System.out.println("Exceptione is ="+e.getMessage());
        }
        int start = -1,end;
        int t = v.size();
        for( int i = 0; i < v.size(); ++i ) {
            String tmp = v.elementAt(i);
            if( tmp.indexOf("/*") > -1 && start == -1 ) {
                start = i;
                System.out.println("\t/* found." + start);
				ClearComment(v, start);
				
            //else if( tmp.indexOf("*/") > -1 && start != -1 ) {
            //   end = i;
            //    if( tmp.endsWith("*/") ) {
            //        v.set(i, v.elementAt(i).substring(0, v.elementAt(i).length()-2));
			//		System.out.println("\tif");
			//		System.out.println(v.subList(start,end).toString());
            //      v.subList(start, end+1).clear();
            //        t -= end-start-1;
            //    }
            //    else {
			//		System.out.println("\telse");
			//		System.out.println(v.subList(start, end+1).toString());
            //        v.subList(start, end+1).clear();
            //       t -= end-start;
            //    }
                
				
				
                //v.subList(start, end-1).clear();
				
                start = -1; end = -1;
            }
            //System.out.println(tmp);
            //System.out.println("\t"+v.size());
        }
        System.out.println("=========================");
        for( int i = 0; i < v.size(); ++i ) {
            String tmp = v.elementAt(i);
            System.out.println(tmp);
        }
        System.out.println("=========================");
    }
    public void ClearComment(Vector<String> v, int start) {
        for( int z = start; z < v.size(); ++z) {
            String tmp = v.elementAt(z);
            if( tmp.indexOf("/*") > -1 && z != start ) {
                ClearComment(v, z);
            }
            if( tmp.indexOf("*/") > -1 && start != -1 ) {
                int end = z;
                if( tmp.endsWith("*/") ) {
                    v.set(z, v.elementAt(z).substring(0, v.elementAt(z).length()-2));
                    System.out.println("\tif");
                    System.out.println(v.subList(start,end).toString());
                    v.subList(start, end+1).clear();				
                    break;
                }
                else {
                    System.out.println("\telse");
                    System.out.println(v.subList(start, end+1).toString());
                    v.subList(start, end+1).clear();
                    break;
                }
            }
        }
    }
}

