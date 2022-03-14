package com.pedalclecle.atcoder.abc217.b;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 217 A - Lexicographic Order
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

        String S = sc.next();
        String T = sc.next();

        if(S.compareTo(T) < 0) {
            answer.append("Yes");
        } else {
            answer.append("No");
        }
        System.out.println(answer.toString());
    }
}
