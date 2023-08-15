package main.java.synchronize;

/***
 * Here all the methods are synchronized on same monitor object (StaticSynchronizedExchanger.class object)
 */
public class StaticSynchronizedExchanger {
    private static Object object = null;

    public static synchronized Object getObject() {
        return object;
    }

    public static synchronized void setObject(Object object) {
        StaticSynchronizedExchanger.object = object;
    }

    public static Object getObj() {
        synchronized (StaticSynchronizedExchanger.class)
        {
            return object;
        }
    }

    public static void setObj(Object object) {
        synchronized (StaticSynchronizedExchanger.class)
        {
            StaticSynchronizedExchanger.object = object;
        }
    }
}
