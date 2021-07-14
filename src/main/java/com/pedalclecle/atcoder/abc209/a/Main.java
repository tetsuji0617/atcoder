package com.pedalclecle.atcoder.abc209.a;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 209 B - Can you buy them all? /
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
        int X = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            X = X - sc.nextInt();
            if (i % 2 == 0)
                X = X + 1;
        }
        if(0 <= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
