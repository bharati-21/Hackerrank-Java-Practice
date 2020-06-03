/*
Problem Link : https://www.hackerrank.com/challenges/can-you-access/problem
*/

// Solution :
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;

public class Problem57 {
	public static void main(String[] args) throws Exception {
		try{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			  int num = Integer.parseInt(br.readLine().trim());
			  Object o;
        o = new Inner().new Private();
        System.out.println(num + " is " + ((Solution.Inner.Private)o).powerof2(num));
		    System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
	  }
	  catch (DoNotTerminate.ExitTrappedException e) {
			  System.out.println("Unsuccessful Termination!!");
		}
	}
  
	static class Inner {
		private class Private { 
			  private String powerof2(int num) {
				    return ((num&num-1)==0)?"power of 2":"not a power of 2";
			  }
		}
	}
}
	
	
