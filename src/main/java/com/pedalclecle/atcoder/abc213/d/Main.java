package com.pedalclecle.atcoder.abc213.d;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 213 A - Bitwise Exclusive Or
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

        System.out.println(A ^ B);

    }
}
