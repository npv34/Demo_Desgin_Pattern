package src.Singleton;

public  class UserManager {
    public DBConnect dbConnect;
    public static UserManager instance = null;

    private UserManager() {
        dbConnect = DBConnect.getInstance();
        dbConnect.connect();
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser() {
        System.out.println("Add user");
    }

    public void removeUser(int id) {
        System.out.println("Remove user");
    }

    public void updateUser() {
        System.out.println("Update user");
    }
}