package com.pedalclecle.atcoder.abc217.c;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 217 C - Inverse of Permutation
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

        int[] array = new int[N];
        for(int i = 0; i < N; i++ ) {
            array[sc.nextInt() -1] = i+1;
        }

        for(int i = 0; i < N; i++) {
            answer.append(array[i]).append(" ");
        }

        System.out.println(answer.toString().trim());
    }
}
