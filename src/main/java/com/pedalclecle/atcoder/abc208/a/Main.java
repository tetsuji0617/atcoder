package com.pedalclecle.atcoder.abc208.a;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 208 A - Rolling Dice
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int diceThrowTimes = sc.nextInt();
        int diceTotal = sc.nextInt();

        if(diceTotal <= 6 * diceThrowTimes && 1 * diceThrowTimes <= diceTotal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
