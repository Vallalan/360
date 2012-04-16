package pkg360;

import java.util.Date;

/**
 * @author Caleb Morris
 */
public class Score implements Comparable<Score>{
    public int uScore;
    public String uName;
    public Date date;
    public int endtime;
    
    public Score( int s, String n ) {
        uScore = s;
        uName = n;
        date = new Date();
        //TODO finish score
        //endtime = ;
    }
    
    @Override
    public int compareTo(Score otherScore) {
        if(this.uScore > otherScore.uScore) {
            return 1;
        }
        else if(this.uScore < otherScore.uScore) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
