/*
Problem Link : https://www.hackerrank.com/challenges/java-date-and-time/problem?h_r=next-challenge&h_v=zen
*/

// Solution :

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar calndr = Calendar.getInstance(); 
        calndr.set(Calendar.MONTH, month-1); 
        calndr.set(Calendar.YEAR, year);
        calndr.set(Calendar.DAY_OF_MONTH, day);
        String weekday = "SUNDAY";
        switch (calndr.get(Calendar.DAY_OF_WEEK)) {
            case 1 : weekday =  "SUNDAY";
                     break;
            case 2 : weekday =  "MONDAY";
                     break;
            case 3 : weekday =  "TUESDAY";
                     break;
            case 4 :
                     weekday =  "WEDNESDAY";
                     break;
            case 5 : 
                     weekday =  "THURSDAY";
                     break;
            case 6 : 
                     weekday =  "FRIDAY";
                     break;
            case 7 :
                     weekday = "SATURDAY";
                     break;
        }
        return weekday;
    } 
}
public class Problem12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);
        String res = Result.findDay(month, day, year);
        bufferedWriter.write(res);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
