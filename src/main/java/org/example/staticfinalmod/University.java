package org.example.staticfinalmod;

public class University {

    static String universityName;
    final int STUDENT_ID;
    String studentName;

    University(int studentID, String studentName) {
        this.STUDENT_ID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Имя студента: " + this.studentName + ", ID студента: " + this.STUDENT_ID + ", Университет: " + universityName);
    }
}
