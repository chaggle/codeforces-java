package org.chaggle.codeforces.A732;

import java.util.Scanner;


public class Main {
    private static Integer buyShovel(Integer k, Integer r) {
        int max = Integer.MAX_VALUE;
        for (int i = 1; i < max; i++) {
            if (((i * k - r) % 10 == 0) || (i * k) % 10 == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.next());
        int r = Integer.parseInt(scanner.next());
        System.out.println(buyShovel(k, r));

    }
}