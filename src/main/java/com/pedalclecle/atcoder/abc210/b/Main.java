package com.pedalclecle.atcoder.abc210.b;

import java.util.Scanner;

/**
 * AtCoder Beginner Contest 210 B - Bouzu Mekuri
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int N = Integer.parseInt(sc.next());
        String S = sc.next();


        for(int i = 1; i < N+1; i++) {
            if("1".equals(S.substring(i-1, i))) {
                if(i % 2 == 1) {
                    System.out.println("Takahashi");
                } else {
                    System.out.println("Aoki");
                }
                break;
            }
        }
        sc.close();
    }
}
