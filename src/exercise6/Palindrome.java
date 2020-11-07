package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        int b = a;
        int c = b;
        assert a > 0 : "Fehler";
        int e = 1;
        while ((a / 10) != 0) {
          ++e;
          a = a / 10;
        }

        int d [] = new int [e];
        for (int i = 0; i < d.length; ++i) {
          d [i] = b % 10;

          b = b / 10;

        }
        int h = 0;

        for (int s = 0; s < d.length; ++s) {
          h = h * 10;
          h = h + d[s];          
        }
        if (h == c) {
          System.out.println("Palindrome: true!");
        } else {
          System.out.println("Palindrome: false!");
        }

    }
}
