package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q8: Sum of even numbers from 1 to 50
class SumOfEven {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=2; i<=50; i+=2) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}


