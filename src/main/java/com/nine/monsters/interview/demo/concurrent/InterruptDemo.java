package com.nine.monsters.interview.demo.concurrent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterruptDemo {
    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                log.info("Thread run");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            while (true) {
                // interrupt() 方法会设置线程的中断标记
                if (this.isInterrupted()) {
                    log.info("Thread isInterrupted");
                    break;
                }
                log.info("Thread run");
            }
        }
    }

    public static class MyThread3 extends Thread {
        @Override
        public void start() {
            try {
                log.info("{} running", Thread.currentThread());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                log.error("{} InterruptedException", Thread.currentThread());
            }
        }
    }
}
