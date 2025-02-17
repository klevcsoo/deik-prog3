package org.example;

public class Main {
    public static void main(String[] args) {
        var s1 = SingletonEager.getInstance();
        var s2 = SingletonEager.getInstance();
    }
    }