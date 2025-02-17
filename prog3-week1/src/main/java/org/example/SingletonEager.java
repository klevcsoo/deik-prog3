package org.example;

/**
 * Olyan osztály, amiből max egy van.
 * Ez például egy eager (tanár szerint greedy?), thread-safe változat.
 */
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
