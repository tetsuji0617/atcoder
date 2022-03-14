package com.pedalclecle.atcoder.abc211.c;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

/**
 * AtCoder Beginner Contest 211 C - Min Difference
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
        int M = sc.nextInt();

        int[] nA = new int[N];
        int[] mA = new int[M];

        for (int i = 0; i < N; i++) {
            nA[i] = sc.nextInt();
        }
        Arrays.sort(nA);
        for (int i = 0; i < M; i++) {
            mA[i] = sc.nextInt();
        }
        Arrays.sort(mA);

        int answer = 1000000000;

        int x = 0;
        int y = 0;
        while (x < N && y < M) {
            answer = min(answer, abs(nA[x] - mA[y]));
            if (nA[x] <= mA[y])
                x++;
            else
                y++;
        }
        System.out.println(answer);
    }
}
