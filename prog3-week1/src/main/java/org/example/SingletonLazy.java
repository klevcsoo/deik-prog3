package org.example;

// TODO: read car prices from DB, put DB handler in a singleton, create a few classes using the singleton to get data from DB

/**
 * Olyan osztály, amiből max egy van.
 * Ez például egy lazy, thread-safe változat.
 * A "synchronized" keyword nélkül non-thread-safe lenne.
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }
}
