package com.pedalclecle.atcoder.abc211.e;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 212 E - Safety Journey
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
        int K = sc.nextInt();

        int[] dp = new int[N];
        int[] dp2 = new int[N];

        Arrays.fill(dp, 0);
        dp[0] = 1;
        
        for(int i = 0; i < K;i++) {
            int s = 0;
        }
    }
}
