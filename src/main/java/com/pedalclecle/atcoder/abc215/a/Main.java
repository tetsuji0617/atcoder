package com.pedalclecle.atcoder.abc215.a;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 215 A
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

        String S = sc.nextLine();

        if("Hello,World!".equals(S)) {
            answer.append("AC");
        } else {
            answer.append("WA");
        }
        System.out.println(answer.toString());
    }
}
