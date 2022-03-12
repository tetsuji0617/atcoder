package com.pedalclecle.atcoder.abc210.a;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 209 A - Cabbages
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
        int A = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int answer = 0;
        if (A <= N) {
            answer = A * X + (N - A) * Y;
        } else {
            answer = N * X;
        }
        System.out.println(answer);
        sc.close();
    }
}
