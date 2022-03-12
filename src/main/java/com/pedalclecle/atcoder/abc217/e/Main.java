package com.pedalclecle.atcoder.abc217.e;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * AtCoder Beginner Contest 217 E - Sorting Queries
 *
 * @author pedalclecle
 */

public class Main {

    StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int Q = sc.nextInt();

        var list = new ArrayList<Integer>();
        var map = new TreeMap<Integer, Integer>();

        for (int i = 0; i < Q; i++) {
            int query = sc.nextInt();

            if (query == 1) {
                int value = sc.nextInt();
                list.add(value);
                if (map.get(value) == null || map.get(value) == 0) {
                    map.put(value, 1);
                } else {
                    map.put(value, map.get(value) + 1);
                }
            } else if (query == 3) {
                list = new ArrayList<>(map.keySet());
            } else {
                int peek = list.remove(0);
                System.out.println(peek);
                if (map.get(peek) == 1) {
                    map.remove(peek);
                } else {
                    map.put(peek, map.get(peek) - 1);
                }
            }
        }
    }
}