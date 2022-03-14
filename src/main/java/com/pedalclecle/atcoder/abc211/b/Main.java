package com.pedalclecle.atcoder.abc211.b;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 212 B - Weak Password
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        String A = sc.next();

        int[] inputArray = new int[A.length()];

        for (int i = 0; i < A.length(); i++) {
            inputArray[i] = Integer.parseInt(A.substring(i, i + 1));
        }

        String answer = "Strong";

        if (inputArray[0] == inputArray[1] && inputArray[1] == inputArray[2] && inputArray[2] == inputArray[3]) {
            answer = "Weak";
        } else {
            if ((inputArray[0] + 1) % 10 == inputArray[1] && (inputArray[0] + 2) % 10 == inputArray[2]
                    && (inputArray[0] + 3) % 10 == inputArray[3]) {
                answer = "Weak";
            }
        }

        System.out.println(answer);
    }
}
