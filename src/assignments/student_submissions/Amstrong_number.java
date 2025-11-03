package assignments.student_submissions;

import java.sql.SQLOutput;

public class Amstrong_number {
    static void main() {
        int n = 153;
        int org_num = n;
        int result = 0;
        int digits= 0;
        int temp = n;
        while (temp != 0) {
             temp=temp/10;
             digits++;
        }
        temp=n;
        while(temp!=0){
            int digit=temp%10;
            result += Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (result == org_num)
            System.out.println(org_num + " is an Armstrong number");
        else
            System.out.println(org_num + " is not an Armstrong number");

    }
}
