package com.pedalclecle.atcoder.abc208.b;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 208 B - Factorial Yen Coin
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int P = sc.nextInt();

        int one = 1;

        int answer = 0;

        int[] factorialCoin = new int[10];
        for(int i = 0; i < 10; i++) {
            one = one * (i+1);
            factorialCoin[i]  = one;
        }

        for(int i = 9; 0 <= i;i--) {
            answer = answer + P /factorialCoin[i];
            P = P % factorialCoin[i];
        }
        System.out.println(answer);
    }
}
