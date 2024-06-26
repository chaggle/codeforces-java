package org.chaggle.codeforces.A443;

import java.util.*;


public class Main {
    private static Integer getLetterNumber(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c: chars) {
            if (c != '{' && c != ' ' && c != '}' && c != ','){
                set.add(c);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Integer size = getLetterNumber(s);
        System.out.println(size);

    }
}