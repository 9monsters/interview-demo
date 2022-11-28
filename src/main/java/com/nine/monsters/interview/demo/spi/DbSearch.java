package com.nine.monsters.interview.demo.sip;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangjia
 */
@Slf4j
public class DbSearch implements Search{
    @Override
    public String searchDoc(String keyword) {
        log.info("DbSearch --> {}", keyword);
        return "db";
    }
}
