package com.pedalclecle.atcoder.abc209.b;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 209 A - Counting
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A <= B) {
            System.out.println(B - A + 1);
        } else {
            System.out.println(0);
        }
    }
}
