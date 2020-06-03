/*
Problem Link : https://www.hackerrank.com/challenges/java-dequeue/problem
*/

// Solution :
import java.util.*;

public class Problem42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> h = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            h.add(num);
            if(m==deque.size()) {
                if(h.size() > count) {
                    count = h.size();
                }
                int first = deque.remove();
                if(!deque.contains(first)) {
                    h.remove(first);
                }
            }
        }
        System.out.println(count);
    }
}



