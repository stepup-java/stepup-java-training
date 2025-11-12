package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

// Q8: Sum of even numbers from 1 to 50
public class SumEvenOneToFifty {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=2; i<=50; i+=2) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}

