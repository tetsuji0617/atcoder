package com.pedalclecle.atcoder.abc211.d;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 212 D - Querying Multiset
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int Q = sc.nextInt();

        Queue<Long> queue = new PriorityQueue<>();

        long sum = 0;
        for (int i = 0; i < Q; i++) {
            int opeType = sc.nextInt();
            if (opeType == 1) {
                queue.add(sc.nextInt() - sum);
            } else if (opeType == 2) {
                int add = sc.nextInt();
                sum = sum + add;
            } else if( opeType ==3) {
                System.out.println(queue.poll() + sum);
            }
        }
    }
}
