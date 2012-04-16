package pkg360;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Caleb Morris
 */
public class Transfer {
    private static Transfer instance = null;
    public Hint current;
    
    public JList horizontalContain;
    public JList verticalContain;
    public JTextField scoreContain;
    public JTextField timerContain;
    
    public JLabel[][] num;
    public JLabel[][] let;
    public JPanel[][] contain;
    
    public loginFrame tLF;
    
    protected Transfer() {
      // Exists only to defeat instantiation.
    }
    public static Transfer getInstance() {
        if(instance == null) {
            instance = new Transfer();
        }
        return instance;
    }
}
