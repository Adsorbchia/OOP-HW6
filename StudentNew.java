package ru.gb.oseminar.service;

public class StudentNew extends Student {

    public StudentNew(String firstName, String secondName, String patronymic, String dateOfBirth, String s) {
        super(firstName, secondName, patronymic, dateOfBirth, s);
    }



    public StudentNew(String firstName, String secondName, String patronymic, String dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth, studentId);



    }
}

