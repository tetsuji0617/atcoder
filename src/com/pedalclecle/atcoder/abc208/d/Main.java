package com.pedalclecle.atcoder.abc208.d;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

/**
* AtCoder Beginner Contest 208 D - Shortest Path Queries 2
* @author pedalclecle
*/
public class Main {

    static final long INF = Long.MAX_VALUE/3;

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int N = sc.nextInt();
        int M = sc.nextInt();

        long[][] ways = new long[N+1][N+1];
        for(int i=1; i <= N; i++) {
            Arrays.fill(ways[i], INF);
            ways[i][i] = 0;
        }
        for(int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int time = sc.nextInt();
            ways[from][to] = time;
        }

        long answer = 0l;
        for(int k = 1; k <= N; k++) {
           long[][] next = new long[N + 1][N + 1];
           for(int s = 0; s <= N; s++) {
               for(int t = 0; t <= N; t++) {
                   next[s][t] = min(ways[s][t], ways[s][k] + ways[k][t]);
                   if(next[s][t] < INF) {
                       answer += next[s][t];
                   }
               }
           }
           ways = next;
        }
        System.out.println(answer);
    }
}
