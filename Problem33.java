/*
Problem Link : https://www.hackerrank.com/challenges/java-negative-subarray/problem
*/

// Solution :

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, j;
        int a[] = new int[n];
        for(i=0; i<n; i++) {
            a[i] = s.nextInt();
        }
        int count = 0;
        for(i=0; i<n; i++) {
            int sum = 0;
            for(j=i; j<n; j++) {
                sum+=a[j];
                if(sum < 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
