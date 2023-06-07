package com.cui.Day12;

import javax.swing.*;
import java.util.concurrent.locks.ReentrantLock;

public class LockDebug {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();

    }
}
