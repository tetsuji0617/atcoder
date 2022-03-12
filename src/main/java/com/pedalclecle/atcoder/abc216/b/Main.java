package com.pedalclecle.atcoder.abc216.b;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 216 A - Signed Difficulty
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

        String[] XY = sc.next().split("\\.");

        int X = Integer.parseInt(XY[0]);
        int Y = Integer.parseInt(XY[1]);
        answer.append(X);
        if(0 <= Y && Y <=2 ) {
            answer.append("-");
        } else if (7 <= Y && Y <=9 ) {
            answer.append("+");
        }
        System.out.println(answer.toString());
    }
}
