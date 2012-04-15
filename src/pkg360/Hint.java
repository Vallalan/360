package pkg360;
//TODO finish this stupid class (import data from file to this format)
/**
 * @author Caleb Morris
 */
public class Hint {
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
}
