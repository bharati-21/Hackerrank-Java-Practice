/*
Problem Link : https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

// Solution :

import java.util.Scanner;
public class Problem17 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s;
        String largest = "";
        for(int i=0; i<=s.length()-k; i++) {
            String temp = (s.substring(i,i+k));
            smallest = temp.compareTo(smallest) < 0 ? temp : smallest;
            largest = temp.compareTo(largest) > 0 ? temp : largest;
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
