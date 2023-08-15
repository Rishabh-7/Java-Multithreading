package main.java.synchronize;

/***
 * Here all the methods are synchronized on the same monitor object (instance of class SynchronizedExchanger)
 */
public class SynchronizedExchanger {
    protected Object obj = null;

    public synchronized Object getObj() {
        return this.obj;
    }

    public synchronized void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObject() {
        synchronized (this) // this denotes the class instance. Here we use 'this' instance as a monitor object
        {
            return this.obj;
        }
    }

    public void setObject(Object obj) {
        synchronized (this)
        {
            this.obj = obj;
        }
    }
}


