package com.pedalclecle.atcoder.abc208.c;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
* AtCoder Beginner Contest 208 C - Fair Candy Distribution
* @author pedalclecle
*/
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int N = sc.nextInt();
        long K = sc.nextLong();

        int[] people = new int[N];

        Map<Integer, Long> peopleMap = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            people[i] = sc.nextInt();
            peopleMap.put(people[i], K / N);
        }
        Arrays.sort(people);

        int remainingSweets = (int) (K % N);
        for (int i = 0; i < remainingSweets; i++) {
            peopleMap.put(people[i], peopleMap.get(people[i]) + 1);
        }

        for (Integer tempNumber : peopleMap.keySet()) {
            System.out.println(peopleMap.get(tempNumber));
        }
    }
}
