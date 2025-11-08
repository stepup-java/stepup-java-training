package assignments.student_submissions.codecrafters.vijay_chopade.assignment.assignment_07;

// Q30: Print Fibonacci series up to 10 terms
class Program30 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
