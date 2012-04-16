package pkg360;
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
    public int number;
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
        if( this.startX > h.startX ) {
            return -1;
        }
        else if( this.startX < h.startX ) {
            return 1;
        }
        else {
            if( this.startY > h.startY ) {
                return -1;
            }
            else if( this.startY < h.startY ) {
                return 1;
            }
            else {
                if( this.ori == Hint.Orientation.ACROSS && h.ori == Hint.Orientation.DOWN) {
                        return -1;
                }
                else if( this.ori == Hint.Orientation.DOWN && h.ori == Hint.Orientation.ACROSS ) {
                        return 1;
                }
                else {
                    if( this.answer.equals(h.answer) && this.hint.equals(h.hint)
                        && this.length == h.length) {
                            return 0;
                    }
                    else {
                        return 1;
                    }
                }
            }
        }
    }
}
