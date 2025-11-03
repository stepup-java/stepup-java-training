package assignments.student_submissions;

public class Product {
    static void main() {
        int n=1234;
        int sum=0;
//        for(;n!=0;n=n/10){
//            int digit=n%10;
//            sum*=digit;
//        }
//        System.out.println(sum);
//        while(n!=0){
//            int digit=n%10;
//            sum*=digit;
//            n=n/10;
//        }
//        System.out.println(sum);

        do{
            int digit=n%10;
            sum*=digit;
            n=n/10;
        }while(n!=0);
        System.out.println(sum);

    }
}
