package assignments.student_submissions;

public class Fibonacci {
    static void main() {
        int n=10;
        int a=0;
        int b=1;
        System.out.print("Fibbonacii series: "+a+" "+b);
//        for(int i=2;i<n;i++){
//            int next=a+b;
//            System.out.println(next);
//            a=b;
//            b=next;
//        }
        int i=2;
//       while(i<n){
//           int next=a+b;
//            System.out.print(" "+next);
//            a=b;
//            b=next;
//            i++;
//       }

        do{
            int next=a+b;
            System.out.print(" "+next);
            a=b;
            b=next;
            i++;
        }while(i<n);
    }
}
