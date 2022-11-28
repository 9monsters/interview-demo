package com.nine.monsters.interview.demo.spi;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

//@SpringBootTest
class SipTest {
    @Test
    void testSip() {
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        for (Search search : s) {
            search.searchDoc("aa");
        }
    }
}
