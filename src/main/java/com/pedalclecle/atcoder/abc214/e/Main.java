package com.pedalclecle.atcoder.abc214.e;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 214 E - Packing Under Range Regulations
 *
 * #25087040
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

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[][] intervals = new int[N][];
            for (int t = 0; t < N; t++) {
                intervals[t] = new int[] { sc.nextInt(), sc.nextInt() };
            }

            // テストのインプット幅のうち、左側ソート→右側の順でソート
            Arrays.sort(intervals, Comparator.comparing((int[] x) -> x[0]).thenComparing(x -> x[1]));

            // プライオリティキューを生成。テストの右側の順で比較
            PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparing(x -> x[1]));
            int currLeft = 1;
            int id = 0;
            String ans = "Yes";
            while (id < N || !heap.isEmpty()) {
                if (heap.isEmpty())
                    currLeft = intervals[id][0];
                while (id < N && intervals[id][0] <= currLeft)
                    heap.add(intervals[id++]);
                int[] curr = heap.poll();
                if (currLeft > curr[1]) {
                    ans = "No";
                    break;
                }
                currLeft++;
            }
            System.out.println(ans);
        }
    }
}
