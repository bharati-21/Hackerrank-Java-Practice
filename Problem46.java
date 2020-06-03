/*
Problem Link : https://www.hackerrank.com/challenges/java-md5/problem
*/

// Solution :
import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class Problem46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            // return bytesToHex(md.digest
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } 
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    
    }
}
