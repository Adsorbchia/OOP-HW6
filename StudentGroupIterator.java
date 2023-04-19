package ru.gb.oseminar.service;

import java.util.Iterator;
import java.util.List;

public abstract class StudentGroupIterator implements Iterator {

    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }}

//    public abstract StudentGroupIterator iterator();
//}

