package assignments.student_submissions;

public class Gretest_digit {
    static void main() {
        int n=4529;
        int max=-1;
//        for(;n!=0;n=n/10){
//            int digit=n%10;
//            if(digit>max){
//                max=digit;
//            }
//        }
//        System.out.println(max);
//        while(n!=0){
//            int digit=n%10;
//            if(digit>max){
//                max=digit;
//            }
//            n=n/10;
//        }
//        System.out.println(max);
        do{
            int digit=n%10;
            if(digit>max){
                max=digit;
            }
            n=n/10;
        }while(n!=0);
        System.out.println(max);
    }
}
