package com.pedalclecle.atcoder.abc214.c;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 214 C - Distribution
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

        int N = Integer.parseInt(sc.nextLine());
        String S[] = sc.nextLine().split(" ");

        String T[] = sc.nextLine().split(" ");

        long[] sunuke = new long[N + 1];

        Arrays.fill(sunuke, 99999999999l);

        for (int i = 0; i < N; i++) {
            long s = Long.parseLong(S[i]);
            long t = Long.parseLong(T[i]);

            if (t < sunuke[i]) {
                sunuke[i] = t;
            }
            if (s + sunuke[i] < sunuke[i + 1]) {
                sunuke[i + 1] = s + sunuke[i];
            }
        }
        if (sunuke[N] < sunuke[0]) {
            sunuke[0] = sunuke[N];
        }
        for (int i = 0; i < N; i++) {
            long s = Long.parseLong(S[i]);
            long t = Long.parseLong(T[i]);

            if (t < sunuke[i]) {
                sunuke[i] = t;
            }
            if (s + sunuke[i] < sunuke[i + 1]) {
                sunuke[i + 1] = s + sunuke[i];
            }
        }
        if (sunuke[N] < sunuke[0]) {
            sunuke[0] = sunuke[N];
        }

        for (int i = 0; i < N; i++) {
            answer.append(sunuke[i]).append("\r\n");
        }
        System.out.println(answer.toString());
        sc.close();
    }
}
