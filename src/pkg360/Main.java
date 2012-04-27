package pkg360;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        guiFrame fr = new guiFrame();
        fr.setVisible(true);
        
        /*
        InputTest t = new InputTest();
        t.main();
        */
    }
    public static boolean startTimer() {
        // TODO add a pause on score
        // TODO change to start on second login if 2-player mode
        // TODO reset on newgame
        // Start timer
        int delay = 1000;   // delay for 5 sec.
        int period = 1000;  // repeat every sec.
        
        Transfer t = Transfer.getInstance();
        //if( t.timer == null ) {
            t.timer = new Timer();
        //}
        

        t.timer.scheduleAtFixedRate(new TimerTask() {
            UserData d = UserData.getInstance();
            Transfer t = Transfer.getInstance();
            @Override
            public void run() {
                if( !t.isPaused ) {
                    t.timerContain.setText(""+(++d.uBoard_.time));
                    System.out.println(d.uBoard_.time);
                }
                //if( d.uBoard_.bScore != null ) {
                //    cancel();
                //}
            }
        }, delay, period);
        //
        return false;
    }
    public static boolean cancelTimer() {
        Transfer t = Transfer.getInstance();
        if( t.timer != null ) {
            t.timer.cancel();
        }
        return false;
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
        // TODO check for duplicate before saving
        SaveData s = SaveData.getInstance();
        UserData d = UserData.getInstance();
        Gson gsonSave = new Gson();
        try {
            if( d.uHints != null ) {
                if( s.userSaves == null ) {
                    s.userSaves = Main.expand(s.userSaves, 1);
                }
                else {
                    s.userSaves = Main.expand(s.userSaves, s.userSaves.length+1);
                }
                if(d.uSaveName == null) {
                    System.out.print("uSaveName is null");
                    int count = 0;
                    for (int i = 0; i < s.userSaves.length; i++) {
                        if( s.userSaves[i].uName.compareTo(d.uName) == 0 ) {
                            count++;
                        }
                    }
                    d.uSaveName = "save"+(count+1);
                }
                s.userSaves[s.userSaves.length-1] = d;
                PrintWriter out = new PrintWriter(
                    new FileWriter("saves.txt"));
                String tmp = gsonSave.toJson(s.userSaves);
                out.print(tmp);
                out.close();
            }
            else{
                System.out.println("no game selected, not going to save");
            }
        }
        catch( Exception e ) {
            System.out.println("Exceptione is ="+e.getMessage());
        }
    }
}
