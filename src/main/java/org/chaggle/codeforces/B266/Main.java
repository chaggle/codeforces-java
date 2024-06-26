package org.chaggle.codeforces.B266;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static char[] swapBG(char[] s) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length - 1; i++) {
            if (s[i] == 'B' && s[i + 1] == 'G') {
                list.add(i);
            }
        }

        for (Integer l : list) {
            s[l] = 'G';
            s[l + 1] = 'B';
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < t; i++) {
            chars = swapBG(chars);
        }
        System.out.println(chars);

    }
}