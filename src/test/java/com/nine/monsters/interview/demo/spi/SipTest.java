package com.nine.monsters.interview.demo.sip;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;
import java.util.ServiceLoader;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
class SipTest {
    @Test
    void testSip() {
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = s.iterator();
        while (iterator.hasNext()) {
            Search search = iterator.next();
            search.searchDoc("aa");
        }
    }
}
