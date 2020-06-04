/*
Problem Link : https://www.hackerrank.com/challenges/java-static-initializer-block/problem?h_r=next-challenge&h_v=zen
*/

// Solution :
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem10 {

static int B, H;
static boolean flag;
static Scanner s;
static {
    s = new Scanner(System.in);
    B = s.nextInt();
    H = s.nextInt();
    try {
        if( B<=0 || H<=0) {
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
        flag = true;
    }
    catch(Exception e) {
        System.out.println(e);
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}

