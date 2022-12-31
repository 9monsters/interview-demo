package com.nine.monsters.interview.demo.concurrent;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class InterruptDemoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testInt() {
        Thread demo = new InterruptDemo.MyThread1();
        demo.start();
        demo.interrupt();
        log.info("Main run");
    }

    @Test
    void testInt2() {
        Thread demo = new InterruptDemo.MyThread2();
        demo.start();
        demo.interrupt();
        log.info("Main run");
    }

    @Test
    void testInt3() {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        threadPool.submit(new InterruptDemo.MyThread3());
        threadPool.submit(new InterruptDemo.MyThread3());
        threadPool.submit(new InterruptDemo.MyThread3());
        threadPool.shutdown();

//        threadPool.shutdownNow();
// 调用 Executor 的 shutdown() 方法会等待线程都执行完毕之后再关闭，
// 但是如果调用的是 shutdownNow() 方法，则相当于调用每个线程的 interrupt() 方法
        while (true) {
            if (threadPool.isShutdown()) {
                break;
            }
        }
    }
}
