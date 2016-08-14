/*
Enum is said to be best approach for applying singleton and it cannot be inherited.
 */
package singleton_enum;

public enum Singleton_Enum{
    INSTANCE;
    private Singleton_Enum() {}
    
    public void getInstance(){
        System.out.println("Instance created by single instance");
    }  
}

class mainClass{
    public static void main(String[] args){
        Singleton_Enum.INSTANCE.getInstance();
    }
}
    
