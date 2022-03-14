package com.pedalclecle.atcoder.abc214.b;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 214 B - B - How many?
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

        int S = sc.nextInt();
        int T = sc.nextInt();

        int counter = 0;
        for (int a = 0; a <= S; a++) {
            for (int b = 0; a + b <= S; b++) {
                for (int c = 0; a + b + c <= S; c++) {
                    if (a * b * c <= T) {
                        counter++;
                    } else {
                        break;
                    }
                }
            }
        }
        answer.append(counter);
        System.out.println(answer.toString());
        sc.close();
    }
}
