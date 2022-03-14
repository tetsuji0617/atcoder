package com.pedalclecle.atcoder.abc216.c;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * AtCoder Beginner Contest 216 C - Many Balls
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

        long N = sc.nextLong();

        boolean isContinue = true;
        var answerList = new ArrayList<String>();
        while(isContinue) {
            if(N%2==1){
                N = N-1;
                answerList.add("A");
            } else {
                N = N/2;
                answerList.add("B");
            }
            if(N==0) isContinue = false;
        }
        for(int i = answerList.size(); 0 < i; i-- ) {
            answer.append(answerList.get(i-1));
        }
        System.out.println(answer.toString());
    }
}
