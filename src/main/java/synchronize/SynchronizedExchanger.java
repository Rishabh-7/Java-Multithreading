package main.java.synchronize;

public class SynchronizedExchanger {
    protected Object obj = null;

    public synchronized Object getObj() {
        return this.obj;
    }

    public synchronized void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObject() {
        synchronized (this) // this denotes the class instance
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
