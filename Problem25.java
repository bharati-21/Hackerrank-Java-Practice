/*
Problem Link : https://www.hackerrank.com/challenges/tag-content-extractor/problem
*/

// Solution :

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem25 {
	  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    int testCases = Integer.parseInt(in.nextLine());
		    while(testCases>0) {
			      String line = in.nextLine();
			      Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);
			      boolean found = false;
            while (m.find()) {
                found = true;
                System.out.println(m.group(2));
            }
            if(!found) {
                System.out.println("None");
            }
			      testCases--;
		    }
	  }
}



