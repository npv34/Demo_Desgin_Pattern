package src.Singleton;

public class DBConnect {
    public String url;
    public String username;
    public String password;
    public static int count = 0;
    private static DBConnect instance = null;

    private DBConnect(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        count++;
    }

    public static DBConnect getInstance() {
        if (instance == null) {
            instance = new DBConnect("localhost", "root", "1234");
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to database...");
        // Implement connection logic here
    }


}
