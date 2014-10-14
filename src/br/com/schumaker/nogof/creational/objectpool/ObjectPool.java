package br.com.schumaker.nogof.creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author  Hudson Schumaker
 */
public abstract class ObjectPool<T> {

    private long expirationTime;
    private Hashtable<T, Long> locked, unlocked;

    public ObjectPool() {
        expirationTime = 30000; // 30 segundos
        locked = new Hashtable<T, Long>();
        unlocked = new Hashtable<T, Long>();
    }

    protected abstract T create();
    public abstract boolean validate(T o);
    public abstract void expire(T o);
    public synchronized T acquire() {
        long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if ((now - unlocked.get(t)) > expirationTime) {
                    // Objeto expirado
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unlocked.remove(t);
                        locked.put(t, now);
                        return (t);
                    } else {
                        // falha da verificação
                        unlocked.remove(t);
                        expire(t);
                        t = null;
                    }
                }
            }
        }
        // nenhum objeto disponível, então cria um novo
        t = create();
        locked.put(t, now);
        return (t);
    }

    public synchronized void release(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }
}