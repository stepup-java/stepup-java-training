package assignments.student_submissions.codecrafters.vijay_chopade.assignment.assignment_07;

// Q8: Sum of even numbers from 1 to 50
class Program8 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=2; i<=50; i+=2) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}


