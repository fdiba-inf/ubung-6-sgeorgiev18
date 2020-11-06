package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean Palindrome;
        int a;
        a = input.nextInt();
        int p [] = new int [a];        
        for (int i = 0; i < p.length; ++i) {
          p [i] = input.nextInt();
        }
        if (p [0] == p [p.length - 1]) {
          Palindrome = true;
        } else {
          Palindrome = false;
        }
        System.out.println("Palindrome: " + Palindrome);

        
    }
}
