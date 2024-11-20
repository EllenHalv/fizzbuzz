package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        fizzBuzz(n);

        bufferedReader.close();
    }

    /*
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            //if % 3 and 5 print FizzBuzz
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    //if % 3 but NOT 5 print Fizz
                    System.out.println("Fizz");
                }
            } else {
                //if % 5 but NOT 3 print Buzz
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    //if NOT % 3 or 5 - print value of i
                    if (i < n) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}