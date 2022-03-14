package com.pedalclecle.atcoder.abc214.a;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 214 A - New Generation ABC
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

        int N = sc.nextInt();

        if (N <= 125) {
            answer.append(4);
        } else if (N <= 211) {
            answer.append(6);
        } else {
            answer.append(8);
        }
        System.out.println(answer.toString());
        sc.close();
    }
}
