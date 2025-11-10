package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

// Q28: Stop printing when number divisible by 9
public class StopWhenDivisibleByNine {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++) {
            if(i % 9 == 0) break;
            System.out.print(i + " ");
        }
    }
}

