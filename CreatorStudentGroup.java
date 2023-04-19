package ru.gb.oseminar.service;

import java.util.List;

public class CreatorStudentGroup {
    public StudentGroup createStudentGroup( List<Student> students,Teacher teacher) {
        StudentGroup studentGroup = new StudentGroup( students);
      return studentGroup;
    }
}
