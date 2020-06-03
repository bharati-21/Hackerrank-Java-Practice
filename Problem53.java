/*
Problem Link : https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
*/

// Solution :
import java.io.*;
import java.util.*;

public class Problem53 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.println((n/m));
        }
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
