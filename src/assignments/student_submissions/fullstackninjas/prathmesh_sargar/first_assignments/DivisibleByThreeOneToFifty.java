package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

// Q12: Numbers divisible by 3 from 1 to 50
public class DivisibleByThreeOneToFifty {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++) {
            if(i%3==0)
                System.out.print(i + " ");
        }
    }
}
