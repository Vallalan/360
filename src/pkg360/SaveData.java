package pkg360;
/**
 * @author Caleb Morris
 */
public class SaveData {
    private static SaveData instance = null;
    public UserData[] userSaves;
    protected SaveData() {
      // Exists only to defeat instantiation.
    }
    public static SaveData getInstance() {
        if(instance == null) {
            instance = new SaveData();
        }
        return instance;
    }
}
