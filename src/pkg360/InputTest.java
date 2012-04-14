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
                start = -1; end = -1;
            }
            //System.out.println(tmp);
            //System.out.println("\t"+v.size());
        }

		int sizeOfBoard = -1;
		//structure of clue and words lists is map(posisiton -> map(orientation -> string))
		//orientations 0 for accros, 1 for down
		
		Vector<String> clueList = new Vector<String>();
		Vector<String> wordList = new Vector<String>();

        System.out.println("=========================");
        for( int i = 0; i < v.size(); ++i ) {
            String tmp = v.elementAt(i);

			//to get the size of the board
			if( isParsableToInt(tmp) && sizeOfBoard == -1) {
				sizeOfBoard = Integer.parseInt(tmp);
				System.out.println(sizeOfBoard);

			//to add a clue to the list
			} else if( tmp.indexOf('\"') > -1) {
				String clue= tmp; //begin the clue string
				do  {
						++i;
						tmp = v.elementAt(i);
						clue = clue + " " + tmp;
				} while( tmp.indexOf('\"') == -1);

				while( tmp.indexOf('#') == -1) {
					clue = clue + "/" + tmp;
					++i;
					tmp = v.elementAt(i);

				}
				System.out.println(clue);
				clueList.add(clue);
			} else if (!tmp.equals(""))  {
				String word = tmp;
				while( tmp.indexOf('#') == -1) {
					word = word + "/" + tmp;
					++i;
					tmp = v.elementAt(i);
					
				}
				System.out.println(word);
				wordList.add(word);
			}


           
        }
		wordList.remove("##");
		System.out.println(wordList.lastElement());
        System.out.println("=========================");
    }



	private boolean isParsableToInt(String z) {
		try {
			Integer.parseInt(z);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
	//Given the vector and the starting element of a comment
	//removes everything included in the comment bounds.
	public void ClearComment(Vector<String> v, int start) {
		for( int z = start; z < v.size(); ++z ) {
			String tmp = v.elementAt(z);


			//checks for nested comments
			if( tmp.indexOf("/*") > -1 && z != start ) {
				ClearComment(v, z);
			}

			//checks for the end of comment
			if( tmp.indexOf("*/") > -1 && start != -1 ) {
				int end = z;
				if( tmp.endsWith("*/") ) {
					v.set(z, v.elementAt(z).substring(0, v.elementAt(z).length()-2));
					System.out.println("\tif");
					System.out.println(v.subList(start,end).toString());
					v.subList(start, end+1).clear();				
					return;
				}
				else {
					System.out.println("\telse");
					System.out.println(v.subList(start, end+1).toString());
					v.subList(start, end+1).clear();
					return;
				}
				}
			}
	}
}

