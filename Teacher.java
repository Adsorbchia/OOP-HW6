package ru.gb.oseminar.service;

public class Teacher<T> extends User {

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth) {
        super(firstName,secondName,patronymic,dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" + "firstName=" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() + '}';
    }
}

