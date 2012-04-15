package pkg360;

public class Main {

    /**
     * @param args the command line arguments
     */
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

        OutputTest ot = new OutputTest();
        ot.init();
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
    public static void save() {
        // TODO finish save method
    }
}
