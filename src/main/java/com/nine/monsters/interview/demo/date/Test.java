package com.nine.monsters.interview.demo.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjusters;

public class Test {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.firstDayOfYear()), LocalTime.MIN);
        LocalDateTime end = LocalDateTime.of(LocalDate.now().with(TemporalAdjusters.lastDayOfYear()), LocalTime.MAX);
        System.out.println(start.toInstant(ZoneOffset.of("+8")).toEpochMilli());
        System.out.println(end.toInstant(ZoneOffset.of("+8")).toEpochMilli());
    }
}
