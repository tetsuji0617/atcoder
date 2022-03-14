package com.pedalclecle.atcoder.abc210.d;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

/**
 * AtCoder Beginner Contest 210 D - National Railway
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    private static final long MAX_VALUE = Long.MAX_VALUE/2;

    public void solve(Scanner sc) {

        int H = sc.nextInt();
        int W = sc.nextInt();
        int C = sc.nextInt();
        long[][] dp = new long[H + 1][W + 2];

        for (int i = 0; i < H + 1; i++) {
            Arrays.fill(dp[i], MAX_VALUE);
        }

        long minimumCost = MAX_VALUE;
        long[][] Aij = new long[H+1][W+1];
        for (int i = 1; i < H + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                Aij[i][j] = sc.nextLong();
                dp[i][j] = min(min(Aij[i][j], dp[i - 1][j] + C), dp[i][j - 1] + C);
                long temp = min(dp[i - 1][j], dp[i][j - 1]) + Aij[i][j] + C;
                if (temp < minimumCost)
                    minimumCost = temp;
            }
        }
        for (int i = 1; i < H + 1; i++) {
            for (int j = W; 0 < j; j--) {
                dp[i][j] = min(min(Aij[i][j], dp[i - 1][j] + C), dp[i][j + 1] + C);
                long temp = min(dp[i - 1][j], dp[i][j + 1]) + Aij[i][j] + C;
                if (temp < minimumCost)
                    minimumCost = temp;
            }
        }
        System.out.println(minimumCost);
    }
}
