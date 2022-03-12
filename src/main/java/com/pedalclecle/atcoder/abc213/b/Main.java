package com.pedalclecle.atcoder.abc213.b;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 213 D - Takahashi Tour
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    int N;
    StringBuilder answer;
    int[] cities;
    int[][] loadMatrix;

    public void solve(Scanner sc) {

        N = sc.nextInt();
        cities = new int[N];

        loadMatrix = new int[N][N];
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            loadMatrix[a - 1][b - 1] = 1;
            loadMatrix[b - 1][a - 1] = 1;
        }
        sc.close();

        answer = new StringBuilder("");
        route(0);

        System.out.println(answer.toString().trim());
    }

    public void route(int now) {
        cities[now] = 1;
        answer.append(now + 1).append(" ");
        for (int i = 0; i < N ; i++) {
            if (loadMatrix[now][i] == 1 && cities[i] == 0) {
                route(i);
                answer.append(now + 1).append(" ");
            }
        }
    }
}
