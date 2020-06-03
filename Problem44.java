/*
Problem Link : https://www.hackerrank.com/challenges/java-priority-queue/problem
*/

// Solution :
import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    int getID() {
        return this.id;
    }
    String getName() {
        return this.name;
    }
    double getCGPA() {
        return this.cgpa;
    }
}

class Priorities {
    List<Student> getStudents(List<String> events) {
         PriorityQueue < Student > pq = new PriorityQueue(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID));
        List<Student> students = new ArrayList<>();
        for(String e : events) {
            Scanner in =new Scanner(e);
            String event = in.next();
            if(event.equals("ENTER")) {
                String name = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();
                Student s = new Student(id,name,cgpa);
                pq.add(s);
            }
            else {
                Student first = pq.poll();
            }
            in.close();
        }
        Student first = pq.poll();
        if(first==null) {
            return students;
        }
        else {
            while (first != null) {
                students.add(first);
                first = pq.poll();

            }
            return students;
        }
    }
}
public class Problem44 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        List<Student> students = priorities.getStudents(events);
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } 
        else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
