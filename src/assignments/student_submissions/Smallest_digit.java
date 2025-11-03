package assignments.student_submissions;

public class Smallest_digit {
    static void main() {
        int n=4529;
        int min=10;
//        for(;n!=0;n=n/10){
//            int digit=n%10;
//            if(digit<min){
//                min=digit;
//            }
//        }
//        System.out.println(min);
//        while(n!=0){
//            int digit=n%10;
//            if(digit<min){
//                min=digit;
//            }
//            n=n/10;
//        }
//        System.out.println(min);
        do{
            int digit=n%10;
            if(digit<min){
                min=digit;
            }
            n=n/10;
        }while(n!=0);
        System.out.println(min);
    }
}
