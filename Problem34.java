/*
Problem Link : https://www.hackerrank.com/challenges/java-arraylist/problem
*/

// Solution :
import java.io.*;
import java.util.*;

public class Problem34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>();
        while(i<n) {
            int d = s.nextInt();
            nums.add(new ArrayList<Integer>());
            while(d-->0) {
                nums.get(i).add(s.nextInt());
            }
            i++;
        }
        int q = s.nextInt();
        while(q-- > 0) {
            int x = s.nextInt() - 1;
            int y = s.nextInt() - 1;
            if(nums.get(x).size()<=y) {
                System.out.println("ERROR!");
            }
            else {
                System.out.println(nums.get(x).get(y));
            }
        }
        
    }
}
