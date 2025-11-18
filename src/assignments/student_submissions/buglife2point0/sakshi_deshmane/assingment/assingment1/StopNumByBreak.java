package assignments.student_submissions.buglife2point0.sakshi_deshmane.assingment.assingment1;

// Q28: Stop printing when number divisible by 9
class StopNumByBreak {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++) {
            if(i % 9 == 0) break;
            System.out.print(i + " ");
        }
    }
}
