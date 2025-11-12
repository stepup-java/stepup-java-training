package assignments.student_submissions.buglife2point0.prajwal_kalaskar.Prajwal_assignment;

public class Q15 {

    public static void main (String[] args) {
//        15. Sum of digits in a number
//        Input: 1234
//        Output: Sum = 10

        int sum = 0;
        int num = 1234;
      for(int i=1; i<=num; i++ ){
          int digit = num % 10; // 1234 % 10 = 4, here get last digit number
            sum = sum + digit;// 0 + 4 = 4, add to sum
            num = num/10; // 1234 / 10 = 4 remove last digit num from here

      }
        System.out.println();
    }
}
