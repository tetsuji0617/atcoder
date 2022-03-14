package com.pedalclecle.atcoder.abc215.c;

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

        String S = sc.next();
        int K = sc.nextInt();

        var set = new TreeSet<String>();

        permutation(S, "", set);

        String[] array = new String[set.size()];
        set.toArray(array);
        System.out.println(array[K - 1]);
    }

    public void permutation(String q, String ans, TreeSet<String> set) {
        StringBuilder sb = new StringBuilder(ans);
        if (q.length() <= 1) {
            set.add(sb.toString());
        } else {
            for (int i = 0; i < q.length(); i++) {
                permutation((new StringBuilder(q.substring(0, i))).append(q.substring(i + 1)).toString(),
                        (new StringBuilder(ans)).append(q.charAt(i)).toString(), set);
            }
        }
    }
}
