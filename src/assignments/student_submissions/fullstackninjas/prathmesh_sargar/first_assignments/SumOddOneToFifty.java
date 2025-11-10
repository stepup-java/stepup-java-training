package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

// Q9: Sum of odd numbers from 1 to 50
public class SumOddOneToFifty {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=50; i+=2) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}

