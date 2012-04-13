package pkg360;

import java.awt.Color;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Caleb Morris
 */
public class Board {
    public Piece[][] b;
    public int uScore;
    public String uName;
    
    public Board() {
        b = new Piece[15][15];
    }
    public Board( JLabel[][][] j_ ) {
        b = new Piece[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                b[i][j] = new Piece( j_[i][j][0], 
                    j_[i][j][1]);
            }
        }
    }
    public void init(JPanel[][] jH) {
        // Black out all labels
        for( int i = 0; i < 15; ++i ) {
            for (int j = 0; j < 15; j++) {
                b[i][j].contain = jH[i][j];
                b[i][j].contain.setBackground(new Color(0,0,0));
                b[i][j].num.setText("");
                b[i][j].let.setText("");
            }
        }
    }
}
