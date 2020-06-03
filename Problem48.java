/*
Problem Link : https://www.hackerrank.com/challenges/java-biginteger/problem
*/

// Solution :
import java.io.*;
import java.util.*;
import java.math.BigInteger; 

public class Problem48 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        BigInteger bg1 = new BigInteger(a); 
        BigInteger bg2 = new BigInteger(b);
        System.out.println((bg1.add(bg2)) + "\n" + (bg1.multiply(bg2)));
    }
}
