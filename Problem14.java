/*
Problem Link : https://www.hackerrank.com/challenges/java-sort/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

// Solution :

import java.util.*;

class Student {
	  private int id;
	  private String fname;
	  private double cgpa;
	  public Student(int id, String fname, double cgpa) {
		    super();
	    	this.id = id;
		    this.fname = fname;
		    this.cgpa = cgpa;
	  }
	  public Integer getId() {
		    return id;
	  }
	  public String getFname() {
		    return fname;
	  }
	  public Double getCgpa() {
		    return cgpa;
	  }
}


class StudentSortingComparator implements Comparator<Student> { 
    @Override
    public int compare(Student s1, Student s2) { 
        int cgpa = s1.getCgpa().compareTo(s2.getCgpa());
        int name = s1.getFname().compareTo(s2.getFname());
        int id = s1.getId().compareTo(s2.getId());
        if(cgpa !=0 ) {
            return cgpa;
        }
        else {
            if(name != 0 ) {
                return -name;
            }
            else {
                return id;
            }
        }            
    } 
}

public class Problem14 
{
	  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    int testCases = Integer.parseInt(in.nextLine());
		    List<Student> studentList = new ArrayList<Student>();
		    while(testCases>0) {
			      int id = in.nextInt();
			      String fname = in.next();
			      double cgpa = in.nextDouble();
			      Student st = new Student(id, fname, cgpa);
			      studentList.add(st);
			      testCases--;
		    }
        Collections.sort(studentList, new StudentSortingComparator());
        ListIterator<Student> itr = studentList.listIterator(studentList.size());
        while (itr.hasPrevious()) {
            System.out.println(itr.previous().getFname());
        }
	  }
}

/*
  class StudentSortingComparator implements Comparator<Student> { 
      public int compare(Student s1, Student s2) {
          double cgpa1 = s1.getCgpa();
          double cgpa2 = s2.getCgpa();
          if(Math.abs(cgpa1 - cgpa2)<.00000001) {
              int fnameCom = s1.getFname().compareTo(s2.getFname());
              if(fnameCom==0){
                  return s1.getId()-s2.getId(); 
              }
              return fnameCom;
          }
          return (cgpa1<cgpa2)?1:(cgpa1>cgpa2?-1:0);
    }
}
*/






