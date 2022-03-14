package com.pedalclecle.atcoder.abc242.b;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 242 B - Minimize Ordering
 * @author pedalclecle
 */

public class Main {

    StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        String input = sc.next();

        String[] array = new String[input.length()];

        for(int i = 0; i < input.length(); i++) {
            array[i] = input.substring(i, i+1);
        }
        Arrays.sort(array);
        for(int i = 0; i < input.length(); i++) {
            answer.append(array[i]);
        }
        System.out.println(answer.toString());
    }
}
