package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q9: Sum of odd numbers from 1 to 50
class SumOfOdd {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=50; i+=2) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}



