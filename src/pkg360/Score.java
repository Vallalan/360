package pkg360;
/**
 * @author Caleb Morris
 */
public class Score implements Comparable<Score>{
    public int uScore;
    public String uName;
    public int date;
    public int time;
    public int endtime;
    
    public Score( int s, String n ) {
        uScore = s;
        uName = n;
        
        //TODO finish score
        //date = 
        //time = 
        //endtime = ;
    }
    
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
