package com.pedalclecle.atcoder.abc216.a;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 216 B - Same Name
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

        boolean hasSameName = false;
        String[][] names = new String[N][2];
        for (int i = 0; i < N; i++) {
            names[i][0] = sc.next();
            names[i][1] = sc.next();
            for (int j = 0; j < i; j++) {
                if (names[i][0].equals(names[j][0]) && names[i][1].equals(names[j][1])) {
                    hasSameName = true;
                    break;
                }
            }
            if (hasSameName)
                break;
        }
        if(hasSameName) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
