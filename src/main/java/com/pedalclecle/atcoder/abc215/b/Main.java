package com.pedalclecle.atcoder.abc215.b;

import java.util.Scanner;
/**
 * AtCoder Beginner Contest 215 B
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

        long N = sc.nextLong();

        int ans =0;
        while (1 < N) {
            N = N /2;
            ans++;
        }
        answer.append(ans);
        System.out.println(answer.toString());
    }
}
