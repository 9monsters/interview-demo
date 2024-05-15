package com.nine.monsters.interview.demo.newcoder;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HJ0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String aa = in.nextLine();
        System.out.println(aa.chars().distinct().count());
    }
}
