/*
Problem Link : https://www.hackerrank.com/challenges/java-loops/problem?h_r=next-challenge&h_v=zen
*/

// Solution :

import java.util.*;
import java.io.*;

class Problem7 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans=a;
            for(int j = 0; j<n; j++) {
                ans+=(int)Math.pow(2,j)*b;
                System.out.print(ans + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
