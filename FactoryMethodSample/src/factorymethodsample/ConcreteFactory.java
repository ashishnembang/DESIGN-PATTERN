/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodsample;

/**
 *
 * @author Ashish
 */
public class ConcreteFactory implements FactoryInterface{
    private static FactoryInterface factory= new ConcreteFactory();
    
    public static FactoryInterface getFactory(){
        return factory;
    }

    private ConcreteFactory() {
    }
    
    @Override
    public Trace chooseTraceMethod(String className) {
        Trace traceMethod = null;
        if(className.equals("console")){
            traceMethod = new ConsoleTrace();
        }
        if(className.equals("trace.log")){
            traceMethod = new FileTrace();
        }
        
        return traceMethod;
    }
    
}
