package assignments.student_submissions;

public class factorial {
    static void main() {
        int fact=1;
//        for(int i=1;i<6;i++){
//            fact*=i;
//        }
//        System.out.println();
        int i=1;
//        while(i<6){
//            fact*=i;
//            i++;
//        }
//        System.out.println(fact);
        do {
            fact*=i;
            i++;
        }while(i<6);
        System.out.println(fact);
    }
}
