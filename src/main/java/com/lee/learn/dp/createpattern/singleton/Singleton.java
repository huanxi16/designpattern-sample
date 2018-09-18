package com.lee.learn.dp.createpattern.singleton;

/**
 * Keeping just one instance in JVM can avoid to GC frequently,
 * and reduce the waste of resource,
 * in business, some important process or administrator must be single.
 */
public class Singleton {

    /**
     * lazily instantiating
     */
    private static volatile Singleton instance = null;

    /**
     * Hungry Singleton
     */
    private static Singleton singleton = new Singleton();

    private Singleton() {}

    /**
     * Method 3
     * Create
     * @return
     */
    public static Singleton getSingleton() {
        return singleton;
    }

    /**
     * Not thread-safe singleton instance
     * @return
     */
    public static Singleton getInstanceWithNotThreadSafe() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Method 1
     * Using synchronized to guarantee thread safe, however,
     * Thread safe problem just may happen at first calling,
     * Using synchronized will cause performance degradation.
     * @return
     */
    public static synchronized Singleton getInstanceBySynchronized() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Method 2
     * double check lock
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(instance) {
                // memory visibility and command reordering, using volatile to define instance
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private static class SingletonFactory {
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getSingletonByInnerClass() {
        return SingletonFactory.singleton;
    }

    public static Object readResolve() {
        return instance;
    }
}
