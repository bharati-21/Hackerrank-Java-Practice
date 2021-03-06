/*
Problem Link : https://www.hackerrank.com/challenges/java-int-to-string/problem
*/

// Solution :

import java.util.*;
import java.security.*;

public class Problem11 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            String s = Integer.toString(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            }    
            else {
                System.out.println("Wrong answer.");
            }
        } 
        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}


