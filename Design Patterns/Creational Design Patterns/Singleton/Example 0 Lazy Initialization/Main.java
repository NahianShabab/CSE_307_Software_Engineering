public class Main {
    public static void main(String[] args) {
        DatabaseSingleton ds1=DatabaseSingleton.getInstance();
        DatabaseSingleton ds2=DatabaseSingleton.getInstance();
        System.out.println(ds1.getData());
        System.out.println(ds2.getData());
        System.out.println(ds1==ds2);
    }
}
