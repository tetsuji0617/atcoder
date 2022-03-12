package com.pedalclecle.atcoder.abc210.c;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * AtCoder Beginner Contest 210 C - Colorful Candies
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        int N = sc.nextInt();
        int K = sc.nextInt();
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(K);
        int candyType = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int candy = sc.nextInt();

            if(queue.size() == K) {
                int popCandy=0;
                try {
                    popCandy = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(map.containsKey(popCandy)) {
                    if( map.get(popCandy) <=1) {
                        candyType--;
                        map.remove(popCandy);
                    } else {
                        map.put(popCandy, map.get(popCandy) -1);
                    }
                }
            }
            if(!map.containsKey(candy)) {
                if(candyType < K) {
                    candyType++;
                }
                if(answer < candyType ) {
                    answer = candyType;
                }
                map.put(candy, 1);
            } else {
                map.put(candy, map.get(candy) + 1);
            }
            queue.add(candy);
        }
        System.out.println(answer);
        sc.close();
    }
}
