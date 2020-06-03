/*
Problem Link : https://www.hackerrank.com/challenges/java-bitset/problem
*/

// Solution :
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem43 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        while(m-- > 0) {
            String str = s.next();
            if(str.equals("AND")) {
                String n1 = s.next();
                String n2 = s.next();
                if(n1.equals("1")) {
                    b1.and(b2);
                }
                else {
                    b2.and(b1);
                }
            }
            else if(str.equals("OR")) {
                String n1 = s.next();
                String n2 = s.next();
                if(n1.equals("1")) {
                    b1.or(b2);
                }
                else {
                    b2.or(b1);
                }
            }
            else if(str.equals("XOR")) {
                String n1 = s.next();
                String n2 = s.next();
                if(n1.equals("1")) {
                    b1.xor(b2);
                }
                else {
                    b2.xor(b1);
                }
            }
            else if(str.equals("SET")) {
                String n1 = s.next();
                int index = s.nextInt();
                if(n1.equals("1")) {
                    b1.set(index);
                }
                else {
                    b2.set(index);
                }
            }
            else {
                String n1 = s.next();
                int index = s.nextInt();
                if(n1.equals("1")) {
                    b1.flip(index);
                }
                else {
                    b2.flip(index);
                }
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
