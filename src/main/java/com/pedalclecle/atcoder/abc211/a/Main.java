package com.pedalclecle.atcoder.abc211.a;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 212 A - Alloy
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

        String answer = "";
        if (A == 0 && 0 < B) {
            answer = "Silver";
        } else if (0 < A && B == 0) {
            answer = "Gold";
        } else {
            answer = "Alloy";
        }
        System.out.println(answer);
    }
}
