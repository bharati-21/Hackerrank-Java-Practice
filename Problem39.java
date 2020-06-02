/*
Problem Link : https://www.hackerrank.com/challenges/java-hashset/problem
*/

// Solution :
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> h = new HashSet<String>(); 
        int unique = 0;
        for(int i = 0; i<t; i++) {
            String pair = pair_left[i] + " " + pair_right[i];
            if(!h.contains(pair)) {
                unique++;
                h.add(pair);
            }
            System.out.println(unique);
        }   
    }
}
