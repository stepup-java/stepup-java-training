package assignments.student_submissions;

import org.w3c.dom.ls.LSOutput;

public class CountDigits {
    static void main() {
            int n=12345;
        int count=0;
//        for(;n!=0;n=n/10){
//            count++;
//        }
//        System.out.println(count);
//        while(n!=0){
//            n=n/10;
//            count++;
//        }
//        System.out.println(count);
        do{
            n=n/10;
            count++;
        }while(n!=0);
        System.out.println(count);


    }



}
