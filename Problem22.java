/*
Problem Link : https://www.hackerrank.com/challenges/java-regex/problem
*/

// Solution :
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Problem22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
class MyRegex {
    String pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
