/* 
Problem Link : https://www.hackerrank.com/challenges/java-stdin-stdout/problem
*/

// Solution :

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); 
        /* Add a dummy nextLine() since cursor remains near double number entered*/
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
