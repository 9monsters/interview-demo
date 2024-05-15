package com.nine.monsters.interview.demo.newcoder;

import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aa = in.nextInt();

        System.out.println(new StringBuilder(aa + "").reverse().toString());
    }
}
