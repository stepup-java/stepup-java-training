package assignments.student_submissions.techorbit.neha_ingawale.assignment.assignment_07;

// Q8: Sum of even numbers from 1 to 50
class SumOfEvenNum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=2; i<=50; i+=2) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}


