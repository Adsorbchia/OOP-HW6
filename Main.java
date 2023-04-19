package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Принцип единственной ответственности реализован на примере класса StudentGroupService, все его методы вынесены в отдельные классы
 * 2. Принцип открытости и закрытости реализован на примере FinderStudent, добавлен еще один метод по поиску студента по id в группе
 * 3.Принцип постановки , создан новый класс - наследник StudentNew, который реализует методы класса - родителя
 */
public class Main {
    public static void main(String[] args) {
        CreatorStudentGroup creatorStudentGroup = new CreatorStudentGroup();
 StudentService studentService = new StudentService();
 List<Student> students = new ArrayList<>();
 studentService.create("Игорь","Иванов","Иванович", "05.08.88");
 studentService.create("Иван","Петров","Иванович", "05.08.88");
 studentService.create("Олег","Иванов","Иванович", "05.08.88");
 students=studentService.getAll();
 Printer printer = new Printer();
 printer.print(students);
 Teacher teacher = new Teacher("Ирина", "Олеговна", "Иванова", "05.08.88");
 creatorStudentGroup.createStudentGroup(students,teacher);
 StudentGroup studentGroup = creatorStudentGroup.createStudentGroup(students,teacher);
        System.out.println(studentGroup);
FinderStudent finderStudent =new FinderStudent();
finderStudent.getStudentFromGroup(1L,studentGroup);
StudentNew studentNew1= new StudentNew("Иван","Петров","Иванович", "05.08.88",11L);
StudentNew studentNew2= new StudentNew("Иван","Петров","Иванович", "05.08.88",12L);
        System.out.println(studentNew1.compareTo(studentNew2));


    }
}
