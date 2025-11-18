package assignments.student_submissions.techorbit.neha_ingawale.assignment.assignment_07;

// Q28: Stop printing when number divisible by 9
class StopPrinting {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++) {
            if(i % 9 == 0) break;
            System.out.print(i + " ");
        }
    }
}
