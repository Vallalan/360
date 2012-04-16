package pkg360;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        guiFrame fr = new guiFrame();
        fr.setVisible(true);
        
        /*
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
    public static UserData[] expand( UserData[] array, int size) {
        UserData[] temp = new UserData[size];
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
        Transfer t = Transfer.getInstance();
        Gson gsonSave = new Gson();
        if( s.userSaves == null ) {
            s.userSaves = Main.expand(s.userSaves, 1);
        }
        else {
            s.userSaves = Main.expand(s.userSaves, s.userSaves.length+1);
        }
        System.out.println("null check");
        s.userSaves[s.userSaves.length-1] = d;
        // TODO update every val of UserData before adding to array
        try {
            PrintWriter out = new PrintWriter(
                new FileWriter("saves.txt"));
            //TODO test
            System.out.println("before json");
            String tmp = gsonSave.toJson(s.userSaves);
            //System.out.println("after json");
            out.print(tmp);
            out.close();
        }
        catch( Exception e ) {
            System.out.println("Exceptione is ="+e.getMessage());
        }
    }
}
