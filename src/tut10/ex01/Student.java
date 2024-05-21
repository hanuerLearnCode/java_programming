package tut10.ex01;

import java.io.Serializable;

public class Student implements Serializable {
    public String name;
    private double mark;
    public  String faculty;

    public Student(String name, double mark, String faculty) {
        this.name = name;
        this.mark = mark;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + this.getMark() +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
