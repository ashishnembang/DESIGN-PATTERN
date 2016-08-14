
package factorymethodsample;
public class FactoryMethodSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryInterface factoryInterface = ConcreteFactory.getFactory();
        Trace traceMethod1 = factoryInterface.chooseTraceMethod("console");
        traceMethod1.debug("from console");
        
        Trace traceMethod2 = factoryInterface.chooseTraceMethod("trace.log");
        traceMethod2.debug("from fileTrace");
       
        Trace traceMethod3 = factoryInterface.chooseTraceMethod("wrong");
        traceMethod3.debug("no where");
    }
    
}
