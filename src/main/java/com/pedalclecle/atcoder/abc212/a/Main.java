package com.pedalclecle.atcoder.abc212.a;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest E - Safety Journey
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {
        int mod = 998244353;

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        var E = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < N; i++) {
            E.add(new ArrayList<Integer>());
        }

        for(int i =0; i < M; i++) {
            int U = sc.nextInt()-1;
            int V = sc.nextInt()-1;
            E.get(U).add(V);
            E.get(V).add(U);
        }

        long[][] dp = new long[K][N];
        dp[0][0] = 1;

        long answer = 0l;
        for(int i = 0; i < K; i++) {
            long sum = 0l;
            for(int j = 0; j < N;j++) {
                sum += dp[i][j];
            }

            long[][] temp = new long[K][N];
            for(int j = 0; j < N; j++) {
                long value = sum -dp[i][j];
                for(int x: E.get(j)) {
                    value -= dp[i][x];
                }
                temp[i][j] = value % mod;
            }
            dp = temp;
        }
        System.out.println(dp[0][0]);
        sc.close();
    }
}
