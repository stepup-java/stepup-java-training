package assignments.student_submissions.techorbit.neha_ingawale.assignment.assignment_07;

// Q9: Sum of odd numbers from 1 to 50
class SumOfOddNum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=50; i+=2) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}



