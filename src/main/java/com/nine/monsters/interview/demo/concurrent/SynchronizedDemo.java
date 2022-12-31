package com.nine.monsters.interview.demo.concurrent;

public class SynchronizedDemo {
    Object object = new Object();
    public void method1() {
        synchronized (object) {

        }
    }
}
