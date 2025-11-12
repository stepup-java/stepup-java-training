package assignments.student_submissions.buglife2point0.prajwal_kalaskar.Prajwal_assignment;

public class Q9 {
    public static void main(String[] args) {
        // 9. Calculate sum of odd numbers from 1 to 50
        //                 Output: Sum = 625

		int n = 50;
		int sum = 0;
		for(int i=1; i<= n; i++) {
			if(i % 2 == 1) {
				sum = sum + i ;
			}
		}
		System.out.println(sum);
    }
}
