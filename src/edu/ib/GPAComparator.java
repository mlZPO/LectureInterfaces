package edu.ib;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGpa(),s2.getGpa());
    }
}
