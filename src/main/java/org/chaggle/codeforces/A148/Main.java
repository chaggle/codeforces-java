package org.chaggle.codeforces.A148;

import java.util.Scanner;

public class Main {
    private static Integer mod(int k, int l, int m, int n, int d) {
        int count = 0;
        for (int i = 1; i <= d; i++) {
            if (modTrue(i, k) || modTrue(i, l) || modTrue(i, m) || modTrue(i, n)) {
                count++;
            }
        }

        return count;
    }

    private static Boolean modTrue(int m, int n) {
        return m % n == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();
        int l = scanner.nextInt();
        scanner.nextLine();
        int m = scanner.nextInt();
        scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        int d = scanner.nextInt();
        scanner.nextLine();
        int count = mod(k, l, m, n, d);
        System.out.println(count);
    }
}
