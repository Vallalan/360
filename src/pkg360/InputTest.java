package pkg360;
import java.io.*;
import java.util.*;
/*
 * @author Caleb Morris
 * @author Alan Gieske
 */

public class InputTest {
	private Vector<String> clueList;
	private Vector<String> wordList;
	private Vector<String> finalList;
	private int sizeOfBoard;
	private String fileName;

	//enum for the direction of a word (across or down)
	//Access from outside class with InputTest.Orientation.ACROSS or DOWN
	public enum Orientation {
		ACROSS, DOWN;
	}

	public InputTest() {
		fileName = "test_file.txt";
	}
	
	public InputTest(String fileName) {
		this.fileName = fileName;
	}

    public void main() {
        Vector<String> v = new Vector<String>();
        


        try {

			//Attempt to open and read specified file
            BufferedReader reader = 
                new BufferedReader( 
                    new FileReader(fileName) );
            String line = reader.readLine();

			//read in all words and enter them as individual string elements in the vector v
            while(line!=null) {
                v.addAll(Arrays.asList((line.split(" "))));
                //System.out.println(line);
                line = reader.readLine();
            }
        }
        catch(Exception e){
            System.out.println("Exceptione is ="+e.getMessage());
        }
        int start = -1,end;
        int t = v.size();

		//interate through the entire vector searching for any comment indicators
		//removing them and the contained comments
        for( int i = 0; i < v.size(); ++i ) {
            String tmp = v.elementAt(i);

			//spots a start of comment indicator
            if( tmp.indexOf("/*") > -1 && start == -1 ) {
                start = i;
                //System.out.println("\t/* found." + start);
				ClearComment(v, start);								
                start = -1; end = -1;
            }
            //System.out.println(tmp);
            //System.out.println("\t"+v.size());
        }

		sizeOfBoard = -1;
		//structure of clue and words lists is map(posisiton -> map(orientation -> string))
		//orientations 0 for accros, 1 for down
		
		clueList = new Vector<String>();
		wordList = new Vector<String>();

        //System.out.println("=========================");

		//begin iterating through the array to gather the data
        for( int i = 0; i < v.size(); ++i ) {
            String tmp = v.elementAt(i);

			//to get the size of the board
			if( isParsableToInt(tmp) && sizeOfBoard == -1) {
				sizeOfBoard = Integer.parseInt(tmp);
				//System.out.println(sizeOfBoard);

			//to add a clue to the list
			} else if( tmp.indexOf('\"') > -1) {

				//Add a clue and all it's data to the clueList
				String clue= tmp; //begin the clue string

				//Finish the clue string
				do  {
						
						tmp = v.elementAt(++i);
						clue = clue + " " + tmp;
				} while( tmp.indexOf('\"') == -1);

				//move to the next string
				tmp = v.elementAt(++i);


				//Append the extra elements of the clue, delimited by '/'
				while( tmp.indexOf('#') == -1) {
					clue = clue + "/" + tmp;
					tmp = v.elementAt(++i);

				}
				//System.out.println(clue);
				clueList.add(clue);

			//Final case - words, make certain we don't include blank lines
			} else if (!tmp.equals(""))  {

				//Add a word and all data to the wordlist
				String word = tmp;
			
				while( tmp.indexOf('#') == -1) {
					tmp = v.elementAt(++i);
					word = word + "/" + tmp;
					
					
					
										
				}
				
				//System.out.println(word);
				wordList.add(word);
			}


           
        }
		//Trim the end of file header off of the wordlist
		wordList.remove("##");

		finalList = MergeLists(clueList, wordList);
		//System.out.println(finalList);
		//test statements for getter methods
		//System.out.println(getHint(finalList.elementAt(0)));
		//System.out.println(getWord(finalList.elementAt(0)));
		//System.out.println(xPos(finalList.elementAt(0)) + " " + yPos(finalList.elementAt(0)));
		
		//System.out.println(getLength(finalList.elementAt(0)));
		
		if(getOrientation(finalList.elementAt(0)) == Hint.Orientation.ACROSS) {
			//System.out.println("Across is good");
		}
		if(getOrientation(finalList.elementAt(5)) == Hint.Orientation.DOWN) {
			//System.out.println("Down is good");
		}

        //System.out.println("=========================");
    }

	public Vector<Hint> getHints() {
		Vector<Hint> hints = new Vector<Hint>();
		for(int i = 0; i<finalList.size(); ++i) {
			hints.add(StringToHint(finalList.elementAt(i)));
		}
		return hints;

	}

	public Hint StringToHint(String s) {
		String answer = getWord(s);
		String hint = getHint(s);
		int xpos = xPos(s);
		int ypos = yPos(s);
		int length = getLength(s);
		Hint.Orientation ori = getOrientation(s);
		Hint x = new Hint(answer, hint, xpos, ypos, length, ori);
		return x;

	}

	private Vector<String> MergeLists(Vector<String> clues, Vector<String> words) {
		Vector<String> across = new Vector<String>();
		Vector<String> down = new Vector<String>();

		for( int i = 0; i<clues.size(); ++i) {
			String hint = getString(clues.elementAt(i));
			if(words.elementAt(i).startsWith("A")) {
				across.add(hint + "/" + words.elementAt(i));
			} else {
				down.add(hint + "/" + words.elementAt(i));
			}
		}

		for( int z = 0; z < down.size(); ++z) {
			across.add(down.elementAt(z));
		}
		return across;
	}

	//All the getter methods

	//gets the string value given a clue or word from one of the Lists
	private String getString(String hint) {
		String value = hint.split("/")[0];
		if (value.startsWith("\"")) {
			return value.split("\"")[1];
		} else {
			return value;
		}
	}

	public String getHint(String hint) {
		return hint.split("/")[0];
	}

	public String getWord(String hint) {
		return hint.split("/")[1];
	}


	//returns the x position of the word or clue
	public int yPos(String hint) {
		int pos = Integer.parseInt(hint.split("/")[2]);
		return (int)Math.floor(pos/sizeOfBoard);
	}

	//returns the y position of the word or clue
	public int xPos(String hint) {
		int pos = Integer.parseInt(hint.split("/")[2]);
                return (pos-1)%sizeOfBoard;
	}

	//returns the length of the word or clue
	public int getLength(String hint) {
		return Integer.parseInt(hint.split("/")[3]);
	}

	//returns the orientation of the word or clue
	public Hint.Orientation getOrientation(String hint) {
		String dir = hint.split("/")[4];

		if(dir.startsWith("A") || dir.startsWith("a")) {
			return Hint.Orientation.ACROSS;
		} else {
			return Hint.Orientation.DOWN;
		}

	}

	public Vector<String> getWords() {
		return finalList;
	}

	//returns the BoardSize
	public int getBoardSize() {
		return sizeOfBoard;
	}

	//utility method to check if a String represents an integer.
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
	private void ClearComment(Vector<String> v, int start) {
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
					//System.out.println("\tif");
					//System.out.println(v.subList(start,end).toString());
					v.subList(start, end+1).clear();				
					return;
				}
				else {
					//System.out.println("\telse");
					//System.out.println(v.subList(start, end+1).toString());
					v.subList(start, end+1).clear();
					return;
				}
				}
			}
	}
}

