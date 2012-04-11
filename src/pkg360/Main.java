package pkg360;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        guiFrame fr = new guiFrame();
        fr.setVisible(true);
        
        /*
        //
        wordSubmitFrame ws = new wordSubmitFrame();
        ws.setVisible(true);
        //
        
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
        * 
        */
        
        InputTest t = new InputTest();
        t.main();
    }
}
