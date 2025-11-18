package assignments.student_submissions.codecrafters.vijay_chopade.assignment.assignment_07;

// Q29: Print prime numbers from 1 to 50
class Program29 {
    public static void main(String[] args) {
        for(int i=2; i<=50; i++) {
            int count = 0;
            for(int j=2; j<=i/2; j++) {
                if(i%j==0) { count=1; break; }
            }
            if(count==0)
                System.out.print(i + " ");
        }
    }
}
