package assignments.student_submissions.DevSquadX.swapnali_patil.assigment_1;

public class ContEvenAndOdd {
    public static void main(String[] args){
        int number = 123456;
        int evenCount = 0;
        int oddCount = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }

        System.out.println("Even = " + evenCount + ", Odd = " + oddCount);
    }
}



