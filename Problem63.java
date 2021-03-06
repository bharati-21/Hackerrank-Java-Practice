/*
Problem Link : https://www.hackerrank.com/challenges/sha-256/problem
*/

// Solution :
import java.security.MessageDigest;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Problem63 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        in.close();

        try {
            MessageDigest messageDigest 
                = MessageDigest.getInstance("SHA-256");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {}
    }

}
