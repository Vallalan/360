package pkg360;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        guiFrame fr = new guiFrame();
        fr.setVisible(true);
        
        /*
        puzzleSelectorFrame psf = new puzzleSelectorFrame();
        psf.setVisible(true);
        /*
        //
        wordSubmitFrame ws = new wordSubmitFrame();
        ws.setVisible(true);
        //
        /*
        //
        loginFrame lf = new loginFrame();
        lf.setVisible(true);
        //
        
        //
        playerStatsFrame ps = new playerStatsFrame();
        ps.setVisible(true);
        //
        
        //
        createNewProfileFrame cnp = new createNewProfileFrame();
        cnp.setVisible(true);
        //
        InputTest t = new InputTest();
        t.main();
        */
    }
    public static UserPW[] expand( UserPW[] array, int size) {
        UserPW[] temp = new UserPW[size];
        if( array != null ) {
            System.arraycopy(array, 0, temp, 0, array.length);
            for(int j = array.length; j < size; j++)
                temp[j] = null;
        }
        return temp;
    }
    public static Score[] expand( Score[] array, int size) {
        Score[] temp = new Score[size];
        if( array != null ) {
            System.arraycopy(array, 0, temp, 0, array.length);
            for(int j = array.length; j < size; j++)
                temp[j] = null;
        }
        return temp;
    }
    public static void save() {
        // TODO finish save method
        SaveData s = SaveData.getInstance();
        UserData d = UserData.getInstance();
        // TODO find the current count of save numbers, add one
        // expand the collection of saves by 1
        // Add current to it
        // Write it
        Gson gson = new Gson();
        try {
            PrintWriter out = new PrintWriter(
                new FileWriter("users.txt"));
            //out.print(gson.toJson(/**/));
            out.close();
        }
        catch( Exception e ) {
            System.out.println("Exceptione is ="+e.getMessage());
        }
    }
}
