package com.pedalclecle.atcoder.abc241.b;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest B - Pasta
 * @author pedalclecle
 */

public class Main {

    StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int menCount = sc.nextInt();
        int days = sc.nextInt();

        var list = new ArrayList<Integer>();

        for(int i = 0; i < menCount; i++) {
            list.add(sc.nextInt());
        }

        String result = "Yes";
        for(int i = 0; i < days; i++) {
            Integer day = sc.nextInt();
            if(!list.remove(day)) {
                result = "No";
            }
        }
        System.out.println(result);
    }
}
