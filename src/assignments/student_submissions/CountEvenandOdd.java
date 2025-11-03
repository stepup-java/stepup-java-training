package assignments.student_submissions;

public class CountEvenandOdd {
    static void main() {
        int n=128721253;
        int even=0;
        int odd=0;
//        for(;n!=0;n=n/10){
//            int digit=n%10;
//            if(digit!=0) {
//                if (digit % 2 == 0) {
//                    even++;
//                } else {
//                    odd++;
//                }
//            }
//        }
//        while(n!=0){
//            int digit=n%10;
//            if(digit!=0) {
//                if (digit % 2 == 0) {
//                    even++;
//                } else {
//                    odd++;
//                }
//            }
//            n=n/10;
//        }
        do{
            int digit=n%10;
            if(digit!=0) {
                if (digit % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            n=n/10;
        }while(n!=0);
        System.out.println("Even Numbers in digit "+even);
        System.out.println("Odd Numbers in digit "+odd);
    }
}
