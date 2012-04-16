package pkg360;

import java.util.Date;

/**
 * @author Caleb Morris
 */
public class Score implements Comparable<Score>{
    public int uScore;
    public Date date;
    public int endtime;
    public String sName;
    
    public Score( int score, int endtime ) {
        UserData d = UserData.getInstance();
        uScore = score;
        date = new Date();
        this.endtime = endtime;
        sName = d.uName;
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
