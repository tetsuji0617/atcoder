package com.pedalclecle.atcoder.abc199.c;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 199 A - Square Inequality
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
        String S = sc.next();

        int Q = sc.nextInt();

        String answer = S;

        for (int i = 0; i < Q; i++) {

            int T = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            StringBuilder temp = new StringBuilder();
            if (T == 1) {
                if (1 < A)
                    temp.append(answer.substring(0, A - 1));
                temp.append(answer.substring(B - 1, B));
                if (A < B - 1)
                    temp.append(answer.substring(A, B - 1));
                temp.append(answer.substring(A - 1, A));
                if (B < 2 * N)
                    temp.append(answer.substring(B, N * 2));
            } else {
                temp.append(answer.substring(N, 2 * N));
                temp.append(answer.substring(0, N));
            }
            answer = temp.toString();
        }
        System.out.println(answer);
        sc.close();
    }
}
