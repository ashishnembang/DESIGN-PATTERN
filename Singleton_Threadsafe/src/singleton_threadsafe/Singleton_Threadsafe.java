/*
 * This is the best approach for creating Threadsafe(no multithread make singleton vunarable)
    Singleton Pattern.
 */
package singleton_threadsafe;

class Singleton {
    private static Singleton instance = null;
    private static Object obj = new Object();
    public static int count = 0;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (obj) {
                if (instance == null) {
                    count++;
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void getHello() {
        System.out.println("Object count: " + count + "\n");
    }
    
    //must be private
    private Singleton(){}  
}

public class Singleton_Threadsafe {

    public static void main(String[] args) {
        Singleton.getInstance().getHello();
        Singleton.getInstance().getHello();
    }

}
