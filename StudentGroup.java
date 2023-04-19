package ru.gb.oseminar.service;

import java.util.List;

public class StudentGroup {
    private List<Student> students;

    public StudentGroup( List<Student> students) {
        this.students = students;

    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }



    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }

//    @Override
//    public StudentGroupIterator iterator() {
//        return new StudentGroupIterator(this);
//    }
}




