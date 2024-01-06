package com.example.designpatterns.singleton;

public class LazySingletonThreadSafe {
    private static LazySingletonThreadSafe instance;

    private LazySingletonThreadSafe() {}

    public static synchronized LazySingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonThreadSafe();
        }
        return instance;
    }
}
