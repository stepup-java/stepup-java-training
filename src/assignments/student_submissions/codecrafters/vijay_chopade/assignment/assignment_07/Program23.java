package assignments.student_submissions.codecrafters.vijay_chopade.assignment.assignment_07;

// Q23: Numbers divisible by both 3 and 5 from 1 to 100
class Program23 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            if(i%3==0 && i%5==0)
                System.out.print(i + " ");
        }
    }
}
