package com.pedalclecle.atcoder.abc212.e;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest A - Blood Pressure
 *
 * @author pedalclecle
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solve(new Scanner(System.in));
    }

    public void solve(Scanner sc) {

        double A = Double.parseDouble(sc.next());
        double B = Double.parseDouble(sc.next());

        BigDecimal a = new BigDecimal(A);
        BigDecimal b = new BigDecimal(B);

        BigDecimal answer = a.subtract(b);
        answer = answer.divide(new BigDecimal(3.0), 6, 1);
        answer = answer.add(b);
        System.out.println(answer);
        sc.close();
    }
}
