package pkg360;

/**
 * @author Caleb Morris
 */
public class Data {
   private static Data instance = null;
   protected Data() {
      // Exists only to defeat instantiation.
   }
   public static Data getInstance() {
      if(instance == null) {
         instance = new Data();
      }
      return instance;
   }
}
