package SynchronizedSingleton;
public class SyncSingleton{
    private static SyncSingleton instance=null;
    private SyncSingleton(){}
    public static synchronized SyncSingleton getInstance(){
        if(instance==null)
            instance=new SyncSingleton();
        return instance;
    }
}