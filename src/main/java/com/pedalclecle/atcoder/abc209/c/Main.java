package com.pedalclecle.atcoder.abc209.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 209 D - Collision
 *
 * @author pedalclecle
 */
public class Main {

    int[][] map ;
    int N;
    int Q;

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {
        N = sc.nextInt();
        Q = sc.nextInt();

        map = new int[N][N];

        for(int i = 0; i < N-1; i++) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();
//            System.out.println(ai+ " " + bi);
            map[ai-1][bi-1] = 999999;
        }

        for(int i = 0; i < Q; i++) {
            int ci = sc.nextInt();
            int di = sc.nextInt();

//            System.out.println(ci+ " " + di);
            check(ci-1, di-1);
        }
    }

    public void check(int ci, int di) {
        System.out.println("ci di:" + ci + " " + di);
        Integer[] nextAi;
        List<Integer> nextAiList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            if(map[ci][i]==999999) {
                nextAiList.add(i);
//                System.out.println("nextAi:" + i);
            }
            if(map[i][ci] == 999999) {
                nextAiList.add(i);
            }
        }
        nextAi =  nextAiList.toArray(new Integer[nextAiList.size()]);

        Integer[] nextBi;
        List<Integer> nextBiList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            if(map[i][di]==999999) {
                nextBiList.add(i);

//                System.out.println("nextBi:" + i);
            }
            if(map[di][i]==999999) {
                nextBiList.add(i);

//                System.out.println("nextBi:" + i);
            }
        }
        nextBi =  nextBiList.toArray(new Integer[nextBiList.size()]);

        for(int i = 0; i < nextAi.length; i++) {
            for(int j = 0; j < nextBi.length; j++) {
//                System.out.println("nextAi nextBi" + nextAi[i] + " " + nextBi[j]);
                if(nextAi[i] == nextBi[j] || nextAi[j] == nextBi[i]) {
                    System.out.println("Town");return;
                } else if(map[nextAi[i]][nextBi[j]] == 999999 || map[nextAi[j]][nextBi[i]] == 999999) {
                    System.out.println("Load");return;
                } else {
                    check(nextAi[i], nextBi[j]);
                }
            }
        }
    }
}
