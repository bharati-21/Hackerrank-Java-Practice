/*
Problem Link : https://www.hackerrank.com/challenges/java-stack/problem
*/

// Solution : 
import java.util.*;

class Problem38 {
    public static void main(String []argh) {
		    Scanner sc = new Scanner(System.in);
		    while (sc.hasNext()) {
			      String input=sc.next();
            Stack<Character> s = new Stack<>();
            int i;
            for(i = 0; i<input.length(); i++) {
                if(input.charAt(i)=='}') {
                    if(s.isEmpty()) {
                        break;
                    }
                    if(s.peek() != '{') {
                        break;
                    }
                    else if(s.peek() == '{') {
                        s.pop();
                    }
                } 
                else if(input.charAt(i)==')') {
                    if(s.isEmpty()) {
                        break;
                    }
                    if(s.peek() != '(') {
                        break;
                    }
                    else if(s.peek() == '(') {
                        s.pop();
                    }
                }
                else if(input.charAt(i)==']') {
                    if(s.isEmpty()) {
                        break;
                    }
                    if(s.peek() != '[') {
                        break;
                    }
                    else if(s.peek() == '[') {
                        s.pop();
                    }
                }
                else {
                    s.push(input.charAt(i));
                }
            }
            if(i!=input.length()) {
                System.out.println("false");
            }
            else {
                if(s.isEmpty()) {
                    System.out.println("true");   
                }
                else {
                    System.out.println("false");
                }
            }
		    }
		}
}




