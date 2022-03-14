package com.pedalclecle.atcoder.abc214.d;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 214 D - Sum of Maximum Weights
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

        long[][] edge = new long[N - 1][3];

        // インプット読み取り
        for (int i = 0; i < N - 1; i++) {
            long u = sc.nextLong() - 1;
            long v = sc.nextLong() - 1;
            long w = sc.nextLong();
            edge[i][0] = u;
            edge[i][1] = v;
            edge[i][2] = w;
        }

        // ソート
        Arrays.sort(edge, (a, b) -> a[2] > b[2] ? 1 : -1);

        // UnionFindクラス
        UnionFind uf = new UnionFind(N);
        long ans = 0;

        for (int i = 0; i < N - 1; i++) {
            int a1 = (int) edge[i][0];
            int a2 = (int) edge[i][1];
            long w1 = edge[i][2];

            ans += w1 * uf.num[uf.root(a1)] * uf.num[uf.root(a2)];
            uf.unite(a1, a2);
        }
        answer.append(ans);
        System.out.println(answer.toString());
        sc.close();
    }

    class UnionFind {
        int[] parent;
        int[] num;

        public UnionFind(int N) {
            parent = new int[N];
            num = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                num[i] = 1;
            }
        }

        int root(int x) {
            if (parent[x] == x) {
                return x;
            }
            parent[x] = root(parent[x]);
            return parent[x];
        }

        void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry) {
                return;
            }
            parent[rx] = ry;
            num[ry] += num[rx];
            for(int i = 0; i < parent.length;i++) {
                System.out.println(parent[i] + " " + num[i]);
            }
            System.out.println();
        }

    }
}
