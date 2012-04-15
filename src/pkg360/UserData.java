package pkg360;
/**
 * @author Caleb Morris
 */
public class UserData {
   private static UserData instance = null;
   public String uName;
   public int uScore;
   public Board board_;
   public int time;
   public String saveName;
   public Hint[] uHints;
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
