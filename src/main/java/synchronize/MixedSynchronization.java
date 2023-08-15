package main.java.synchronize;

/***
 * Since these methods are synchronized on two different monitor objects, hence two threads will not be blocked when
 * they call these methods at same instance of time
 */
public class MixedSynchronization {
    public static Object staticObj = null;

    /***
     * Here, setStaticObj is synchronized over MixedSynchronization.class object
     */
    public static synchronized void setStaticObj(Object obj) {
        staticObj = obj;
    }

    public Object instanceObj = null;

    /***
     * Here, setInstanceObj is synchronized over an instance of MixedSynchronization class
     */
    public synchronized void setInstanceObj(Object obj) {
        this.instanceObj = obj;
    }
}
