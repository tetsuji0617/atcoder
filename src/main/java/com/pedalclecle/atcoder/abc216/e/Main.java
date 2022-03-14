package com.pedalclecle.atcoder.abc216.e;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;

/**
 * AtCoder Beginner Contest 216 E - Amusement Park
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
        long K = sc.nextLong();

        var map = new TreeMap<Long, Integer>();
        for (int i = 0; i < N; i++) {
            Long key = sc.nextLong();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        map.put(0l, 0);
        Set<Long> keySet = map.keySet();
        Long[] keyArray = keySet.toArray(new Long[keySet.size()]);
        long ans = 0l;
        int n = 0;

        for (int i = keyArray.length - 1; 0 < i; i--) {
            int count = n + map.get(keyArray[i]);
            if ((keyArray[i] - keyArray[i - 1]) * count < K) {
                ans = ans + (exec(keyArray[i]) - exec(keyArray[i - 1])) * count;
                n = n + map.get(keyArray[i]);
                K = K - n * (keyArray[i] - keyArray[i - 1]);
            } else {
                long tempValue = K / (n + map.get(keyArray[i]));
                if (0 < tempValue) {
                    ans = ans + count * (exec(keyArray[i]) - exec(keyArray[i] - tempValue));
                    K = K - count * tempValue;
                }
                ans = ans + K * (keyArray[i] - tempValue);
                K = 0;
            }
        }
        System.out.println(ans);
    }

    public long exec(Long number) {
        return number * (number + 1) / 2;
    }
}
