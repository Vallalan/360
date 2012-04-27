package pkg360;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * @author Caleb Morris
 */
public class Board {
    public Piece[][] b;
    public Score bScore;
    public int time;
    
    public Board() {
        b = new Piece[15][15];
    }
    public Board( JLabel[][][] j_, JList h, JList v, JTextField score, JTextField timer) {
        Transfer t = Transfer.getInstance();
        t.contain = new JPanel[15][15];
        t.let = new JLabel[15][15];
        t.num = new JLabel[15][15];
        b = new Piece[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                b[i][j] = new Piece();
                t.let[i][j] = j_[i][j][0];
                t.num[i][j] = j_[i][j][1];
            }
        }
        t.horizontalContain = h;
        t.verticalContain = v;
        t.scoreContain = score;
        t.timerContain = timer;
    }
    public void init(JPanel[][] jH) {
        // Black out all labels
        Transfer t = Transfer.getInstance();
        for( int i = 0; i < 15; ++i ) {
            for (int j = 0; j < 15; j++) {
                t.contain[i][j] = jH[i][j];
                t.contain[i][j].setBackground(new Color(0,0,0));
                t.num[i][j].setText(" ");
                t.let[i][j].setText(" ");
            }
        }
    }
}
