package com.cui.Thread04;

import java.util.concurrent.locks.ReentrantLock;

//可重入锁 synchronize reentrantLock  //syn 锁不可以被打断 ，lock锁在获取锁的等待过程中可以被打断
//加锁是为了保证数据的安全性
public class LockSyn {
    ReentrantLock lock= new ReentrantLock();
}
