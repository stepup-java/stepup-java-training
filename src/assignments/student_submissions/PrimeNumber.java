package assignments.student_submissions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
//        if(n==2){
//            System.out.println("Prime Number.");
//        }
        int count=0;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                count++;
//            }
//        }
        int i=2;
//        while(i<n){
//            if(n%i==0){
//                count++;
//            }
//            i++;
//        }
        do{
            if(n%i==0){
                count++;
            }
            i++;
        }while(i<n);
        if(count>0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}

