package UI;

import DatabaseObserver.DatabaseObserver;

public class UI implements DatabaseObserver{
    @Override
    public void update(int newData,int oldData){
        System.out.println("UI updated. Now Showing: "+newData);
        System.out.println();
    }
}
