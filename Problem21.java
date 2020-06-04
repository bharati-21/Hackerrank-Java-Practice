/*
Problem Link : https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
*/

// Solution :

import java.util.Scanner;
import java.util.regex.*;

public class Problem21Updated Problem10.java {
	  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    int testCases = Integer.parseInt(in.nextLine());
		    while(testCases>0) {
		        String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
		    }
	  }
}



