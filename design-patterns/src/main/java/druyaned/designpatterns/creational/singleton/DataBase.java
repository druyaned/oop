package druyaned.designpatterns.creational.singleton;

public class DataBase {
    
    private static DataBase instance;
    
    /**
     * The only method allows to get the only instance.
     * @return the only instance of the data base
     */
    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase("SingleDataBase");
        }
        return instance;
    }
    
    private final String name;
    
    private DataBase(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
}
