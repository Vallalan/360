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
    public int startX;
    public int startY;
    public int length;
    public Orientation ori;
}
