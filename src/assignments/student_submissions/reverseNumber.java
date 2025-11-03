package assignments.student_submissions;

import org.w3c.dom.ls.LSOutput;

public class reverseNumber {
    static void main() {
        int n=12345;
        int rev=0;
//        for(;n!=0;n=n/10){
//            int digit=n%10;
//            rev=rev*10+digit;
//        }
//        System.out.println(rev);
//        while(n!=0){
//            int digit=n%10;
//            rev=rev*10+digit;
//            n=n/10;
//        }
//        System.out.println(rev);

        do{
            int digit=n%10;
             rev=rev*10+digit;
             n=n/10;
        }while(n!=0);
        System.out.println(rev);

    }



}
