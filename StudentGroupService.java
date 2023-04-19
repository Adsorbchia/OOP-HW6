package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Принцип единственной ответственности, Каждый метод выносим в отдельный класс
 */
public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup( List<Student> students, Teacher teacher) {
        this.studentGroup = new StudentGroup( students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName){
        List<Student> list= studentGroup.getStudents();
        Iterator<Student> iterator = list.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
               && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }




    }
