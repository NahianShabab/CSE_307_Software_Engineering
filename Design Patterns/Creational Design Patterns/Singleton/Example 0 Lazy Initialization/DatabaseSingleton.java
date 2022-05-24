public class DatabaseSingleton{
    private static DatabaseSingleton instance=null;
    private int data=10;
    private DatabaseSingleton(){}
    public static DatabaseSingleton getInstance(){
        if(instance==null)
            instance=new DatabaseSingleton();
        return instance;
    }
    public int getData(){return data;}
}