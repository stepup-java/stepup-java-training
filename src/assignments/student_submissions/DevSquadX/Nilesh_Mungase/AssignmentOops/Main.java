package assignments.student_submissions.DevSquadX.Nilesh_Mungase.AssignmentOops;

/*
 *  Create a class student
 *  Write Properties for sudent -> id , name, marks
 *  create main class
 *  create Objects of Students
 *  create an arraylist of students ArrayList<Student>
 *  Iterate over arraylist
 *  print student information-> marks > 50
 *
 */
public class Main {
    static void main() {

       Student s1 = new Student(1,100,"Nilesh");
        Student s2 = new Student(2,40,"Pankaj");
        Student s3 = new Student(3,90,"Yash");
        Student s4 = new Student(4,98,"Rajehs");
        Student s5 = new Student(5,22,"Riteshh");
        Student s6 = new Student(6,10,"om");

        for (Student obj: Student.students){
            if (obj.marks>50){
            System.out.println(obj.id+" "+obj.name+" "+obj.marks);
        }
        }



    }
}
