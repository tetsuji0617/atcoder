package com.pedalclecle.atcoder.abc199.a;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 199 B - Intersection
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int N = sc.nextInt();
        int[] arrayA = new int[N];
        int[] arrayB = new int[N];

        for (int i = 0; i < N; i++) {
            arrayA[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            arrayB[i] = sc.nextInt();
        }

        int min = 0;
        int max = 9999999;

        for (int i = 0; i < N; i++) {
            if (min < arrayA[i])
                min = arrayA[i];
            if (arrayB[i] < max)
                max = arrayB[i];
        }

        if (max < min) {
            System.out.println(0);
        } else {
            System.out.println(max - min + 1);
        }
    }
}
