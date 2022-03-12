package com.pedalclecle.atcoder.abc217.d;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * AtCoder Beginner Contest 217 D - Cutting Woods
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

        int N = sc.nextInt();
        int Q = sc.nextInt();

        var map = new TreeMap<Integer, Integer>();
        map.put(0, 0);
        map.put(N, 0);
        int keySize = 2;
        for (int i = 0; i < Q; i++) {
            int c = sc.nextInt();
            int x = sc.nextInt();
            if (c == 1) {
                map.put(x, 0);
                keySize = keySize+1;
            } else {
                Integer[] tempArray = map.keySet().toArray(new Integer[keySize]);
                for (int j = 0; j < tempArray.length - 1; j++) {
                    if (tempArray[j] < x && x < tempArray[j + 1]) {
                        System.out.println(tempArray[j + 1] - tempArray[j]);
                    }
                }
            }
        }
    }
}
