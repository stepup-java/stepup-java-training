package assignments.student_submissions.DevSquadX.Nilesh_Mungase.AssignmentOops;

import java.util.ArrayList;

public class Student {
    int id;
    String name;
    float marks;
    static ArrayList<Student> students = new ArrayList<>();

    public Student(int id, float marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
        students.add(this);
    }
}
