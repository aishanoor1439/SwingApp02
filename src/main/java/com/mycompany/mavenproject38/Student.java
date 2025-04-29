
package com.mycompany.mavenproject38;

public class Student {

    private String StudentName;
    private String CourseName;

    @Override
public String toString() {
    return StudentName + " - " + CourseName;
}

    public void setName(String Name) {
        StudentName = Name;
    }

    public String getName() {
        return StudentName;
    }

    public void setCourseName(String course) {
        CourseName = course;
    }

    public String GetCourseName() {
        return CourseName;
    }
}
