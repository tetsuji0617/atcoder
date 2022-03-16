package com.pedalclecle.atcoder.abc242.c;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 242 C - 1111gal password
 *
 * @author pedalclecle
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int input = sc.nextInt();

        long[][] array = new long[input][9];

        for (int i = 0; i < 9; i++) {
            array[0][i] = 1;
        }

        long answer = 0;
        for (int i = 1; i < input; i++) {
            array[i][0] = array[i - 1][0] + array[i - 1][1];
            array[i][0] %= 998244353;
            for (int j = 1; j < 8; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1];
                array[i][j] %= 998244353;
            }
            array[i][8] = array[i - 1][7] + array[i - 1][8];
            array[i][8] %= 998244353;
        }
        for (int i = 0; i < 9; i++) {
            answer += array[input - 1][i];
        }
        System.out.println(answer %= 998244353);
    }
}
