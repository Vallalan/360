package pkg360;
/**
 * @author Caleb Morris
 */
public class Transfer {
    private static Transfer instance = null;
    public Hint current;
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
