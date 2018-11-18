package edu.ib;

import java.util.Arrays;

public class StudentTester {


    public static void main(String[] args) {

        Student [] students= {new Student(19,4.0,"Johnny"),
                              new Student(23,2.0,"Alan"),
                              new Student(21,3.5,"Susan"),
                              new Student(21,5.5,"Anabel"),
                                 };
        Student [] testArray;

        System.out.println("Original array: " + Arrays.toString(students));

        // sorting using compare interface
        testArray=deepStudentCopy(students);
        Arrays.sort(students);
        System.out.println("After sorting : " + Arrays.toString(students));


        // sorting using comparator interface
        testArray=deepStudentCopy(students);
        Arrays.sort(students, new GPAComparator());
        System.out.println("After sorting : " + Arrays.toString(students));



    } // end main

    public static Student [] deepStudentCopy(Student [] s){

        Student [] copy=new Student[s.length];
        for(int i=0; i<s.length; i++){
            Student p= s[i];
            if (p != null) copy[i]= new Student(s[i]);
        }
        return copy;
    }

} // end class
