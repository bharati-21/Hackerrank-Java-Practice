/*
Problem Link : https://www.hackerrank.com/challenges/java-list/problem
*/

// Solution :
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i<n; i++) {
            l.add(s.nextInt());
        }
        int q = s.nextInt();
        int i = 1;
        while(i <= q) {
            String s1 = s.next();
            if(s1.equals("Insert")) {
                int x = s.nextInt();
                int y = s.nextInt();
                l.add(x,y);
            }
            else {
                int r = s.nextInt();
                l.remove(r);
            }            
            i++;
        }
        for(int x : l) {
            System.out.print(x+ " ");
        }
    }
}
