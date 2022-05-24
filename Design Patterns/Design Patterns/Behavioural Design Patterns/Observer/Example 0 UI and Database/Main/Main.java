package Main;

import Database.Database;
import UI.UI;

public class Main {
    public static void main(String[] args) {
        UI ui=new UI();
        Database database=new Database(-1);
        database.register(ui);
        for(int i=0;i<=5;i++){
            if(i==5){
                database.unregister(ui);
                System.out.println("UI unregistered. Changes in database is not reflected in UI");
                System.out.println();
            }
            database.setData(5*i);
        }
    }
}
