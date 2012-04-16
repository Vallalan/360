package pkg360;
//TODO finish this stupid class (import data from file to this format)
/**
 * @author Caleb Morris
 */
public class Hint implements Comparable<Hint> {
    public enum Orientation {
        ACROSS, DOWN;
    }
    public String answer;
    public String hint;
    public String guess;
    public int startX;
    public int startY;
    public int length;
    public Orientation ori;
    
    public Hint( String answer, String hint, int x , int y, int length, Orientation ori ) {
        this.answer = answer;
        this.hint = hint;
        this.startX = x;
        this.startY = y;
        this.length = length;
        this.ori = ori;
        this.guess = "";
    }
    
    @Override
    public int compareTo(Hint h) {
        if( this.answer.equals(h.answer) && this.hint.equals(h.hint) && 
            this.startX == h.startX && this.startY == h.startY &&
            this.length == h.length && this.ori == h.ori)
            return 0;
        else
            return -1;
    }
}
