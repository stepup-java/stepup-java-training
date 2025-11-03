package assignments.student_submissions;

public class DivisibleBy3and5 {
    static void main() {
        int n=100;
        // Using for loop
//        for(int i=1;i<n;i++){
//            if(i%3==0 && i%5==0){
//                System.out.println(i);
//            }
//        }
        int i=1;
//        while(i<n){
//            if(i%3==0 && i%5==0){
//                System.out.println(i);
//            }
//            i++;
//        }
        do{
            if(i%3==0 && i%5==0){
               System.out.println(i);
            }
           i++;
        }while(i<n);




    }
}
