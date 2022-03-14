package com.pedalclecle.atcoder.abc217.a;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 217 A - Lexicographic Order
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

        var list = new ArrayList<String>();

        list.add("ABC");
        list.add("ARC");
        list.add("AGC");
        list.add("AHC");

        for(int i = 0; i < 3; i++) {
            list.remove(sc.next());
        }
        System.out.println(list.get(0));
    }
}
