package Prajwal_Kalaskar_Assignment;// 16. Reverse a number
//Input: 1234
//Output: 4321

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rev = 0;

        while(num!= 0){

            int digit = num % 10 ; // get the last digit num
            rev = rev*10 + digit; //
            num = num/10;

        }
        System.out.println(rev);
    }
}
