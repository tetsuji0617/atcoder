package com.pedalclecle.atcoder.abc242.a;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 242 A - T-shirt
 * @author pedalclecle
 */

public class Main {

    StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x = sc.nextDouble();

        if(x <= a) {
            System.out.println(1.0);
        } else if(a < x && x <= b) {
             System.out.println(c/(b-a));
        } else {
            System.out.println(0.0);
        }
    }
}
