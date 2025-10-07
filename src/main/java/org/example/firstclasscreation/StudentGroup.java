package org.example.firstclasscreation;

public class StudentGroup {

    private String groupName;
    private int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    public void setStudentCount(int  newStudentCount) {
        this.studentCount = newStudentCount;
    }

    public void printInfo() {
        System.out.println("Группа " + this.groupName + ", Кол-во " + this.studentCount);
    }
}
