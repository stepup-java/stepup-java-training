package assignments.student_submissions.fullstackninjas.prathmesh_sargar.first_assignments;

// Q7: Sum of first 10 natural numbers
public class SumFirstTenNaturals {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}

