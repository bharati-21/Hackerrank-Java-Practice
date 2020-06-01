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
        String[] sArray = s.trim().split("[ !,?._'@]+");
        if(s == null || s.equals("") || s.trim().equals("") || s.length()==0) {
            System.out.println("0");
        }
        else if(s.length() > 400000) {
            return;
        }
        else{
            System.out.println(sArray.length);
        }

        for(String str : sArray) {
            System.out.println(str);
        }
        scan.close();
    }
}



