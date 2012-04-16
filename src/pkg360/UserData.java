package pkg360;
/**
 * @author Caleb Morris
 */
public class UserData {
   private static UserData instance = null;
   public String uName;
   public Board uBoard_;
   public int uBoardSize;
   public String uSaveName;
   public Hint[] uHints;
   public int uDifficulty; // Easy, Medium, Hard: 1,2,3
   public int uNumPlayers;
   protected UserData() {
      // Exists only to defeat instantiation.
   }
   public static UserData getInstance() {
      if(instance == null) {
         instance = new UserData();
      }
      return instance;
   }
}
