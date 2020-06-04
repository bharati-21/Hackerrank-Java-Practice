/*
Problem Link : https://www.hackerrank.com/challenges/java-end-of-file/problem?h_r=next-challenge&h_v=zen
*/

// Solution :

import java.io.*;
import java.util.*;

public class Problem9 {
  public static void main(String[] args) {
        int i = 1;
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            System.out.println(i + " " + s.nextLine());
            i++;
        }
    }
}
