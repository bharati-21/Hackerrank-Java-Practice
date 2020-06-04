/*
Problem Link : https://www.hackerrank.com/challenges/phone-book/problem
*/

// Solution :
import java.util.*;
import java.io.*;

class Problem37 {
	  public static void main(String []argh) {
		    Scanner in = new Scanner(System.in);
		    int n=in.nextInt();
        Map<String, Integer> m = new HashMap<>();
		    for(int i=0;i<n;i++) {
            in.nextLine();
			      String name=in.nextLine();
			      int phone=in.nextInt();
			      m.put(name, phone);
		    }
        in.nextLine();
		    while(in.hasNext()) {
			      String s=in.nextLine();
            if(!m.containsKey(s)) {
                System.out.println("Not found");
            }
            else 
                System.out.println(s + "=" + m.get(s));
		    }
	  }
}



