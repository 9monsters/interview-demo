package com.nine.monsters.interview.demo.hwod;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String L = sc.nextLine();

        int si = 0, li = 0;
        while (si < S.length() && li < L.length()) {
            if (S.charAt(si) == L.charAt(li)) {
                si++;
            }
            li++;
        }

        if (si == S.length()) {
            System.out.println(li -1);
        } else {
            System.out.println(-1);
        }
    }
}
