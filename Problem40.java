/*
Problem Link : https://www.hackerrank.com/challenges/java-generics/problem
*/

// Solution :
import java.io.IOException;
import java.lang.reflect.Method;

class Printer<E> {
    public void printArray(E[] a) {
        for(int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
public class Problem40 {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
                count++;
        }
        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}
