package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q23: Numbers divisible by both 3 and 5 from 1 to 100
class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            if(i%3==0 && i%5==0)
                System.out.print(i + " ");
        }
    }
}
