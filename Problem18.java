/*
Problem Link : https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

// Solution : 
import java.io.*;
import java.util.*;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i=0, j=A.length()-1;
        for(; i<=j; i++, j--) {
            if(A.charAt(i)!=A.charAt(j))
                break;
        }
        if(i>j)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



