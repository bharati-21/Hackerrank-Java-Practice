/*
Problem Link : https://www.hackerrank.com/challenges/java-string-tokens/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

// Solution :

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] sArray = s.split("[, ?.@_'!]+");
        System.out.println(sArray.length);
        for(String str : sArray) {
            System.out.println(str);
        }
        scan.close();

    }
}

