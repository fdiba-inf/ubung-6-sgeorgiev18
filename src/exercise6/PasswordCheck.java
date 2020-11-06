package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
          boolean yes = true;
          int b = 0;
          
          String pass = input.next();
          if (pass.length() < 8) {
            yes = false;
            break;
          } else {
          for (int a = 0; a < pass.length(); ++a) {
            if (Character.isDigit(pass.charAt(a))) {
              ++b;
            
            }
              if (b >= 2) {
              
              yes = true;
              
            }
            if (!Character.isLetterOrDigit(pass.charAt(a))) {
              yes = false;
              break;
              
            }

          }
          if (yes == true) {
          System.out.println("Password valid!");
          break;
        }
        }
          
        } while (true);
          
     

    }
}
