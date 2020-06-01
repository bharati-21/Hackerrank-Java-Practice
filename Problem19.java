/*
Problem Link : https://www.hackerrank.com/challenges/java-anagrams/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

// Solution :

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] count = new int[26];
        for(int i =0; i<a.length(); i++) {
            char c = a.charAt(i);
            count[c-'a']++;
        }
        for(int i =0; i<b.length(); i++) {
            char c = b.charAt(i);
            if(count[c -'a']==0)
                return false;
            count[c-'a']--;
        }
        for(int i = 0; i<26; i++) {
            if(count[i] > 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
