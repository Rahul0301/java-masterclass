package com.example.taskmanager.utils;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyUtil {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void executeWithLock(Runnable criticalSection) {
        lock.lock();
        try {
            criticalSection.run();
        } finally {
            lock.unlock();
        }
    }
}
