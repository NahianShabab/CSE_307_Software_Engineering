package Database;

import java.util.ArrayList;
import java.util.List;
import DatabaseObserver.DatabaseObserver;

public class Database{
    public int data;
    public Database(int d){
        this.data=d;
    }
    List<DatabaseObserver> observers=new ArrayList<>();
    public void register(DatabaseObserver dObserver){
        observers.add(dObserver);
    }
    public void unregister(DatabaseObserver dObserver){
        observers.remove(dObserver);
    }
    public void notifySubscribers(int newData,int oldData){
        for(DatabaseObserver dObserver: observers){
            dObserver.update(newData, oldData);
        }
    }
    public int getData(){
        return data;
    }
    public void setData(int d){
        int oldData=data;
        this.data=d;
        System.out.println("Changing Data in Database from "+oldData+" to "+data);
        System.out.println();
        notifySubscribers(data, oldData);
    }
    
}