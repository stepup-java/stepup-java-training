package assignments.student_submissions.buglife2point0.prajwal_kalaskar.Prajwal_assignment;

public class Q3 {
    public static void main(String[] args) {
        // 8. Calculate sum of even numbers from 1 to 50
        //                 Output: Sum = 650

		int n = 50;
        int sum = 0;
        for(int i = 1; i <= n; i++){
           if(i%2 == 0){
              sum = sum + i;
           }

        }
        System.out.println(sum);
    }
}
