package com.pedalclecle.atcoder.abc215.d;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * AtCoder Beginner Contest 215 C
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
        int M = sc.nextInt();

        var set = new TreeSet<Integer>();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for (int i = 1; i <= M; i++) {
           boolean canAdd = true;
            for(int j = 0; j < N; j++) {
                if(gcd(array[j], i) != 1) {
                    canAdd = false;
                }
            }
            if(canAdd) {
                set.add(i);
            }
        }

        for(int i: set) {
            answer.append(i).append("\r\n");
        }
        System.out.println(answer.toString());
    }

    public int gcd(int x, int y) {
        return y>0?gcd(y,x%y):x;
    }
}
