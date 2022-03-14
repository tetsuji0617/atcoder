package com.pedalclecle.atcoder.abc199.b;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 199 A - Square Inequality
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
        int C = sc.nextInt();

        if(A*A + B*B < C*C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
